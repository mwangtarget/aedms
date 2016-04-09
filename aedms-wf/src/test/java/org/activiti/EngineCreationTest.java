package org.activiti;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.form.TaskFormData;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.subethamail.wiser.Wiser;

import com.aedms.wf.App;
import com.aedms.wf.core.EngineRSClient;
import com.aedms.wf.sample.Applicant;
import com.aedms.wf.sample.ApplicantRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {App.class})
@WebAppConfiguration
@IntegrationTest
public class EngineCreationTest {

    @Autowired
    private RuntimeService runtimeService;

    
    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;
    
    @Autowired
    private FormService formService;

    
    @Test
    public void testHappyPath() {

        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("EngineCreationApproval");


        Task task = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateGroup("recorder")
                .singleResult();
        
        Assert.assertEquals("Engine Creation", task.getName());
        
//        TaskFormData taskForm = formService.getTaskFormData(task.getId());
        
        // Complete the First Form submit
        Map<String, String> formData = new HashMap<>();
        formData.put("fleet", "HP");
        formData.put("subFleet", "Turbo-X");
        formService.submitTaskFormData(task.getId(), formData);

        
        // Completing Approval
        Task taskApproval = taskService.createTaskQuery()
                .processInstanceId(processInstance.getId())
                .taskCandidateGroup("approver")
                .singleResult();

        taskService.complete(taskApproval.getId());
        
        //This will trigger the saveEngine Service task
        
        // Verify process completed
        Assert.assertEquals(1, historyService.createHistoricProcessInstanceQuery().finished().count());

    }

}
