package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.beans.BeanDefinition;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "Time_Limit")
@BeanDefinition
public class TimeLimit extends AedmsEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;

    /**
     * 是否采用结构化期限
     */
    @Column(name = "IS_STRUCT")
    @PropertyDefinition
    private boolean isStructucted;

    /**
     * 是否设置了日历日期限
     */
    @Column(name = "IS_SET_DAY")
    @PropertyDefinition
    private boolean isSetDay;

    /**
     * 比较关系（小于、等于）
     */
    @Column(name = "DAY_RELATION", length = 10)
    @PropertyDefinition
    private String dayRelation;

    /**
     * 截止日期
     */
    @Column(name = "DAY_LIMIT")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date dayLimit;

    /**
     * 是否设置了FH期限(FH: 飞行小时)
     */
    @Column(name = "IS_SET_FH")
    @PropertyDefinition
    private boolean isSetFH;

    /**
     * 关系符（小于、等于）
     */
    @Column(name = "FH_RELATION", length = 10)
    @PropertyDefinition
    private String FHRelation;

    /**
     * 截止飞行小时
     */
    @Column(name = "FH_LIMIT")
    @PropertyDefinition
    private double FHLimit;

    /**
     * 是否设置了FC期限 (FC:飞行循环)
     */
    @Column(name = "IS_SET_FC")
    @PropertyDefinition
    private boolean isSetFC;

    /**
     * 关系符（小于、等于）
     */
    @Column(name = "FC_RELATION", length = 10)
    @PropertyDefinition
    private String FCRelation;

    /**
     * 截止飞行循环
     */
    @Column(name = "FC_LIMIT")
    @PropertyDefinition
    private int FCLimit;

     /**
     * 是否设置了日历日+飞行小时期限
     */
    @Column(name = "IS_SET_DAY_FH")
    @PropertyDefinition
    private boolean isSetDayFH;

    /**
     * 起始日期（日历日+飞行小时）
     */
    @Column(name = "DAY_FH_START")
    @PropertyDefinition
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayFHStart;

    /**
     * 最长可用FH（是否设置了日历日+飞行循环）
     */
    @Column(name = "DAY_FH_LEFT")
    @PropertyDefinition
    private double dayFHLeft;

    /**
     * 是否设置了日历日+飞行循环
     */
    @Column(name = "IS_SET_DAY_FC")
    @PropertyDefinition
    private boolean isSetDayFC;

    /**
     * 起始日期（日历日+飞行循环）
     */
    @Column(name = "DAY_FC_START")
    @PropertyDefinition
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayFCStart;

    /**
     * 最长可用飞行循环（是否设置了日历日+飞行循环）
     */
    @Column(name = "DAY_FC_LEFT")
    @PropertyDefinition
    private int dayFCLeft;

    /**
     * 先到为准。如果打开“要求”选项，该值默认选中（设置为true）
     */
    @Column(name = "IS_FIRST_EF")
    @PropertyDefinition
    private boolean isFirstEffective;

    /**
     * 后到为准
     */
    @Column(name = "IS_LAST_EF")
    @PropertyDefinition
    private boolean isLastEffective;

    /**
     * 文本期限
     */
    @Column(name = "TEXT_TIME_LIMIT", length = 4000)
    @PropertyDefinition
    private String textTimeLimit;

    public TimeLimit() {
    }
    
    /**
     * 
     * @param isStructucted
     * @param isSetDay
     * @param dayRelation
     * @param dayLimit
     * @param isSetFH
     * @param FHRelation
     * @param FHLimit
     * @param isSetFC
     * @param FCRelation
     * @param FCLimit
     * @param isSetDayFH
     * @param dayFHStart
     * @param dayFHLeft
     * @param isSetDayFC
     * @param dayFCStart
     * @param dayFCLeft
     * @param isFirstEffective
     * @param isLastEffective
     * @param textTimeLimit 
     */
    @UseBuilderGenerator
    public TimeLimit(boolean isStructucted, boolean isSetDay, String dayRelation,Date dayLimit,
                      boolean isSetFH, String FHRelation, double FHLimit, boolean isSetFC,
                      String FCRelation, int FCLimit, boolean isSetDayFH, Date dayFHStart,
                      double dayFHLeft, boolean isSetDayFC, Date dayFCStart, int dayFCLeft,
                      boolean isFirstEffective, boolean isLastEffective, String textTimeLimit) {
        this.isStructucted = isStructucted;
        this.isSetDay = isSetDay;
        this.dayRelation = dayRelation;
        this.dayLimit = dayLimit;
        this.isSetFH = isSetFH;
        this.FHRelation = FHRelation;
        this.FHLimit = FHLimit;
        this.isSetFC = isSetFC;
        this.FCRelation = FCRelation;
        this.FCLimit = FCLimit;
        this.isSetDayFH = isSetDayFH;
        this.dayFHStart = dayFHStart;
        this.dayFHLeft = dayFHLeft;
        this.isSetDayFC = isSetDayFC;
        this.dayFCStart = dayFCStart;
        this.dayFCLeft = dayFCLeft;
        this.isFirstEffective = isFirstEffective;
        this.isLastEffective = isLastEffective;
        this.textTimeLimit = textTimeLimit;
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code TimeLimit}.
     * @return the meta-bean, not null
     */
    public static TimeLimit.Meta meta() {
        return TimeLimit.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(TimeLimit.Meta.INSTANCE);
    }

    @Override
    public TimeLimit.Meta metaBean() {
        return TimeLimit.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<Long> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否采用结构化期限
     * @return the value of the property
     */
    public boolean isIsStructucted() {
        return isStructucted;
    }

    /**
     * Sets 是否采用结构化期限
     * @param isStructucted  the new value of the property
     */
    public void setIsStructucted(boolean isStructucted) {
        this.isStructucted = isStructucted;
    }

    /**
     * Gets the the {@code isStructucted} property.
     * @return the property, not null
     */
    public final Property<Boolean> isStructucted() {
        return metaBean().isStructucted().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否设置了日历日期限
     * @return the value of the property
     */
    public boolean isIsSetDay() {
        return isSetDay;
    }

    /**
     * Sets 是否设置了日历日期限
     * @param isSetDay  the new value of the property
     */
    public void setIsSetDay(boolean isSetDay) {
        this.isSetDay = isSetDay;
    }

    /**
     * Gets the the {@code isSetDay} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSetDay() {
        return metaBean().isSetDay().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 比较关系（小于、等于）
     * @return the value of the property
     */
    public String getDayRelation() {
        return dayRelation;
    }

    /**
     * Sets 比较关系（小于、等于）
     * @param dayRelation  the new value of the property
     */
    public void setDayRelation(String dayRelation) {
        this.dayRelation = dayRelation;
    }

    /**
     * Gets the the {@code dayRelation} property.
     * @return the property, not null
     */
    public final Property<String> dayRelation() {
        return metaBean().dayRelation().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 截止日期
     * @return the value of the property
     */
    public Date getDayLimit() {
        return dayLimit;
    }

    /**
     * Sets 截止日期
     * @param dayLimit  the new value of the property
     */
    public void setDayLimit(Date dayLimit) {
        this.dayLimit = dayLimit;
    }

    /**
     * Gets the the {@code dayLimit} property.
     * @return the property, not null
     */
    public final Property<Date> dayLimit() {
        return metaBean().dayLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否设置了FH期限(FH: 飞行小时)
     * @return the value of the property
     */
    public boolean isIsSetFH() {
        return isSetFH;
    }

    /**
     * Sets 是否设置了FH期限(FH: 飞行小时)
     * @param isSetFH  the new value of the property
     */
    public void setIsSetFH(boolean isSetFH) {
        this.isSetFH = isSetFH;
    }

    /**
     * Gets the the {@code isSetFH} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSetFH() {
        return metaBean().isSetFH().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 关系符（小于、等于）
     * @return the value of the property
     */
    public String getFHRelation() {
        return FHRelation;
    }

    /**
     * Sets 关系符（小于、等于）
     * @param FHRelation  the new value of the property
     */
    public void setFHRelation(String FHRelation) {
        this.FHRelation = FHRelation;
    }

    /**
     * Gets the the {@code FHRelation} property.
     * @return the property, not null
     */
    public final Property<String> FHRelation() {
        return metaBean().FHRelation().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 截止飞行小时
     * @return the value of the property
     */
    public double getFHLimit() {
        return FHLimit;
    }

    /**
     * Sets 截止飞行小时
     * @param FHLimit  the new value of the property
     */
    public void setFHLimit(double FHLimit) {
        this.FHLimit = FHLimit;
    }

    /**
     * Gets the the {@code FHLimit} property.
     * @return the property, not null
     */
    public final Property<Double> FHLimit() {
        return metaBean().FHLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否设置了FC期限 (FC:飞行循环)
     * @return the value of the property
     */
    public boolean isIsSetFC() {
        return isSetFC;
    }

    /**
     * Sets 是否设置了FC期限 (FC:飞行循环)
     * @param isSetFC  the new value of the property
     */
    public void setIsSetFC(boolean isSetFC) {
        this.isSetFC = isSetFC;
    }

    /**
     * Gets the the {@code isSetFC} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSetFC() {
        return metaBean().isSetFC().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 关系符（小于、等于）
     * @return the value of the property
     */
    public String getFCRelation() {
        return FCRelation;
    }

    /**
     * Sets 关系符（小于、等于）
     * @param FCRelation  the new value of the property
     */
    public void setFCRelation(String FCRelation) {
        this.FCRelation = FCRelation;
    }

    /**
     * Gets the the {@code FCRelation} property.
     * @return the property, not null
     */
    public final Property<String> FCRelation() {
        return metaBean().FCRelation().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 截止飞行循环
     * @return the value of the property
     */
    public int getFCLimit() {
        return FCLimit;
    }

    /**
     * Sets 截止飞行循环
     * @param FCLimit  the new value of the property
     */
    public void setFCLimit(int FCLimit) {
        this.FCLimit = FCLimit;
    }

    /**
     * Gets the the {@code FCLimit} property.
     * @return the property, not null
     */
    public final Property<Integer> FCLimit() {
        return metaBean().FCLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否设置了日历日+飞行小时期限
     * @return the value of the property
     */
    public boolean isIsSetDayFH() {
        return isSetDayFH;
    }

    /**
     * Sets 是否设置了日历日+飞行小时期限
     * @param isSetDayFH  the new value of the property
     */
    public void setIsSetDayFH(boolean isSetDayFH) {
        this.isSetDayFH = isSetDayFH;
    }

    /**
     * Gets the the {@code isSetDayFH} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSetDayFH() {
        return metaBean().isSetDayFH().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 起始日期（日历日+飞行小时）
     * @return the value of the property
     */
    public Date getDayFHStart() {
        return dayFHStart;
    }

    /**
     * Sets 起始日期（日历日+飞行小时）
     * @param dayFHStart  the new value of the property
     */
    public void setDayFHStart(Date dayFHStart) {
        this.dayFHStart = dayFHStart;
    }

    /**
     * Gets the the {@code dayFHStart} property.
     * @return the property, not null
     */
    public final Property<Date> dayFHStart() {
        return metaBean().dayFHStart().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 最长可用FH（是否设置了日历日+飞行循环）
     * @return the value of the property
     */
    public double getDayFHLeft() {
        return dayFHLeft;
    }

    /**
     * Sets 最长可用FH（是否设置了日历日+飞行循环）
     * @param dayFHLeft  the new value of the property
     */
    public void setDayFHLeft(double dayFHLeft) {
        this.dayFHLeft = dayFHLeft;
    }

    /**
     * Gets the the {@code dayFHLeft} property.
     * @return the property, not null
     */
    public final Property<Double> dayFHLeft() {
        return metaBean().dayFHLeft().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 是否设置了日历日+飞行循环
     * @return the value of the property
     */
    public boolean isIsSetDayFC() {
        return isSetDayFC;
    }

    /**
     * Sets 是否设置了日历日+飞行循环
     * @param isSetDayFC  the new value of the property
     */
    public void setIsSetDayFC(boolean isSetDayFC) {
        this.isSetDayFC = isSetDayFC;
    }

    /**
     * Gets the the {@code isSetDayFC} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSetDayFC() {
        return metaBean().isSetDayFC().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 起始日期（日历日+飞行循环）
     * @return the value of the property
     */
    public Date getDayFCStart() {
        return dayFCStart;
    }

    /**
     * Sets 起始日期（日历日+飞行循环）
     * @param dayFCStart  the new value of the property
     */
    public void setDayFCStart(Date dayFCStart) {
        this.dayFCStart = dayFCStart;
    }

    /**
     * Gets the the {@code dayFCStart} property.
     * @return the property, not null
     */
    public final Property<Date> dayFCStart() {
        return metaBean().dayFCStart().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 最长可用飞行循环（是否设置了日历日+飞行循环）
     * @return the value of the property
     */
    public int getDayFCLeft() {
        return dayFCLeft;
    }

    /**
     * Sets 最长可用飞行循环（是否设置了日历日+飞行循环）
     * @param dayFCLeft  the new value of the property
     */
    public void setDayFCLeft(int dayFCLeft) {
        this.dayFCLeft = dayFCLeft;
    }

    /**
     * Gets the the {@code dayFCLeft} property.
     * @return the property, not null
     */
    public final Property<Integer> dayFCLeft() {
        return metaBean().dayFCLeft().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 先到为准。如果打开“要求”选项，该值默认选中（设置为true）
     * @return the value of the property
     */
    public boolean isIsFirstEffective() {
        return isFirstEffective;
    }

    /**
     * Sets 先到为准。如果打开“要求”选项，该值默认选中（设置为true）
     * @param isFirstEffective  the new value of the property
     */
    public void setIsFirstEffective(boolean isFirstEffective) {
        this.isFirstEffective = isFirstEffective;
    }

    /**
     * Gets the the {@code isFirstEffective} property.
     * @return the property, not null
     */
    public final Property<Boolean> isFirstEffective() {
        return metaBean().isFirstEffective().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 后到为准
     * @return the value of the property
     */
    public boolean isIsLastEffective() {
        return isLastEffective;
    }

    /**
     * Sets 后到为准
     * @param isLastEffective  the new value of the property
     */
    public void setIsLastEffective(boolean isLastEffective) {
        this.isLastEffective = isLastEffective;
    }

    /**
     * Gets the the {@code isLastEffective} property.
     * @return the property, not null
     */
    public final Property<Boolean> isLastEffective() {
        return metaBean().isLastEffective().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 文本期限
     * @return the value of the property
     */
    public String getTextTimeLimit() {
        return textTimeLimit;
    }

    /**
     * Sets 文本期限
     * @param textTimeLimit  the new value of the property
     */
    public void setTextTimeLimit(String textTimeLimit) {
        this.textTimeLimit = textTimeLimit;
    }

    /**
     * Gets the the {@code textTimeLimit} property.
     * @return the property, not null
     */
    public final Property<String> textTimeLimit() {
        return metaBean().textTimeLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public TimeLimit clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            TimeLimit other = (TimeLimit) obj;
            return (getId() == other.getId()) &&
                    (isIsStructucted() == other.isIsStructucted()) &&
                    (isIsSetDay() == other.isIsSetDay()) &&
                    JodaBeanUtils.equal(getDayRelation(), other.getDayRelation()) &&
                    JodaBeanUtils.equal(getDayLimit(), other.getDayLimit()) &&
                    (isIsSetFH() == other.isIsSetFH()) &&
                    JodaBeanUtils.equal(getFHRelation(), other.getFHRelation()) &&
                    JodaBeanUtils.equal(getFHLimit(), other.getFHLimit()) &&
                    (isIsSetFC() == other.isIsSetFC()) &&
                    JodaBeanUtils.equal(getFCRelation(), other.getFCRelation()) &&
                    (getFCLimit() == other.getFCLimit()) &&
                    (isIsSetDayFH() == other.isIsSetDayFH()) &&
                    JodaBeanUtils.equal(getDayFHStart(), other.getDayFHStart()) &&
                    JodaBeanUtils.equal(getDayFHLeft(), other.getDayFHLeft()) &&
                    (isIsSetDayFC() == other.isIsSetDayFC()) &&
                    JodaBeanUtils.equal(getDayFCStart(), other.getDayFCStart()) &&
                    (getDayFCLeft() == other.getDayFCLeft()) &&
                    (isIsFirstEffective() == other.isIsFirstEffective()) &&
                    (isIsLastEffective() == other.isIsLastEffective()) &&
                    JodaBeanUtils.equal(getTextTimeLimit(), other.getTextTimeLimit()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsStructucted());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsSetDay());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayRelation());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsSetFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFHRelation());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFHLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsSetFC());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFCRelation());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFCLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsSetDayFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayFHStart());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayFHLeft());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsSetDayFC());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayFCStart());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDayFCLeft());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsFirstEffective());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsLastEffective());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTextTimeLimit());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(672);
        buf.append("TimeLimit{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("isStructucted").append('=').append(JodaBeanUtils.toString(isIsStructucted())).append(',').append(' ');
        buf.append("isSetDay").append('=').append(JodaBeanUtils.toString(isIsSetDay())).append(',').append(' ');
        buf.append("dayRelation").append('=').append(JodaBeanUtils.toString(getDayRelation())).append(',').append(' ');
        buf.append("dayLimit").append('=').append(JodaBeanUtils.toString(getDayLimit())).append(',').append(' ');
        buf.append("isSetFH").append('=').append(JodaBeanUtils.toString(isIsSetFH())).append(',').append(' ');
        buf.append("FHRelation").append('=').append(JodaBeanUtils.toString(getFHRelation())).append(',').append(' ');
        buf.append("FHLimit").append('=').append(JodaBeanUtils.toString(getFHLimit())).append(',').append(' ');
        buf.append("isSetFC").append('=').append(JodaBeanUtils.toString(isIsSetFC())).append(',').append(' ');
        buf.append("FCRelation").append('=').append(JodaBeanUtils.toString(getFCRelation())).append(',').append(' ');
        buf.append("FCLimit").append('=').append(JodaBeanUtils.toString(getFCLimit())).append(',').append(' ');
        buf.append("isSetDayFH").append('=').append(JodaBeanUtils.toString(isIsSetDayFH())).append(',').append(' ');
        buf.append("dayFHStart").append('=').append(JodaBeanUtils.toString(getDayFHStart())).append(',').append(' ');
        buf.append("dayFHLeft").append('=').append(JodaBeanUtils.toString(getDayFHLeft())).append(',').append(' ');
        buf.append("isSetDayFC").append('=').append(JodaBeanUtils.toString(isIsSetDayFC())).append(',').append(' ');
        buf.append("dayFCStart").append('=').append(JodaBeanUtils.toString(getDayFCStart())).append(',').append(' ');
        buf.append("dayFCLeft").append('=').append(JodaBeanUtils.toString(getDayFCLeft())).append(',').append(' ');
        buf.append("isFirstEffective").append('=').append(JodaBeanUtils.toString(isIsFirstEffective())).append(',').append(' ');
        buf.append("isLastEffective").append('=').append(JodaBeanUtils.toString(isIsLastEffective())).append(',').append(' ');
        buf.append("textTimeLimit").append('=').append(JodaBeanUtils.toString(getTextTimeLimit())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code TimeLimit}.
     */
    public static class Meta extends AedmsEntity.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", TimeLimit.class, Long.TYPE);
        /**
         * The meta-property for the {@code isStructucted} property.
         */
        private final MetaProperty<Boolean> isStructucted = DirectMetaProperty.ofReadWrite(
                this, "isStructucted", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code isSetDay} property.
         */
        private final MetaProperty<Boolean> isSetDay = DirectMetaProperty.ofReadWrite(
                this, "isSetDay", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code dayRelation} property.
         */
        private final MetaProperty<String> dayRelation = DirectMetaProperty.ofReadWrite(
                this, "dayRelation", TimeLimit.class, String.class);
        /**
         * The meta-property for the {@code dayLimit} property.
         */
        private final MetaProperty<Date> dayLimit = DirectMetaProperty.ofReadWrite(
                this, "dayLimit", TimeLimit.class, Date.class);
        /**
         * The meta-property for the {@code isSetFH} property.
         */
        private final MetaProperty<Boolean> isSetFH = DirectMetaProperty.ofReadWrite(
                this, "isSetFH", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code FHRelation} property.
         */
        private final MetaProperty<String> FHRelation = DirectMetaProperty.ofReadWrite(
                this, "FHRelation", TimeLimit.class, String.class);
        /**
         * The meta-property for the {@code FHLimit} property.
         */
        private final MetaProperty<Double> FHLimit = DirectMetaProperty.ofReadWrite(
                this, "FHLimit", TimeLimit.class, Double.TYPE);
        /**
         * The meta-property for the {@code isSetFC} property.
         */
        private final MetaProperty<Boolean> isSetFC = DirectMetaProperty.ofReadWrite(
                this, "isSetFC", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code FCRelation} property.
         */
        private final MetaProperty<String> FCRelation = DirectMetaProperty.ofReadWrite(
                this, "FCRelation", TimeLimit.class, String.class);
        /**
         * The meta-property for the {@code FCLimit} property.
         */
        private final MetaProperty<Integer> FCLimit = DirectMetaProperty.ofReadWrite(
                this, "FCLimit", TimeLimit.class, Integer.TYPE);
        /**
         * The meta-property for the {@code isSetDayFH} property.
         */
        private final MetaProperty<Boolean> isSetDayFH = DirectMetaProperty.ofReadWrite(
                this, "isSetDayFH", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code dayFHStart} property.
         */
        private final MetaProperty<Date> dayFHStart = DirectMetaProperty.ofReadWrite(
                this, "dayFHStart", TimeLimit.class, Date.class);
        /**
         * The meta-property for the {@code dayFHLeft} property.
         */
        private final MetaProperty<Double> dayFHLeft = DirectMetaProperty.ofReadWrite(
                this, "dayFHLeft", TimeLimit.class, Double.TYPE);
        /**
         * The meta-property for the {@code isSetDayFC} property.
         */
        private final MetaProperty<Boolean> isSetDayFC = DirectMetaProperty.ofReadWrite(
                this, "isSetDayFC", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code dayFCStart} property.
         */
        private final MetaProperty<Date> dayFCStart = DirectMetaProperty.ofReadWrite(
                this, "dayFCStart", TimeLimit.class, Date.class);
        /**
         * The meta-property for the {@code dayFCLeft} property.
         */
        private final MetaProperty<Integer> dayFCLeft = DirectMetaProperty.ofReadWrite(
                this, "dayFCLeft", TimeLimit.class, Integer.TYPE);
        /**
         * The meta-property for the {@code isFirstEffective} property.
         */
        private final MetaProperty<Boolean> isFirstEffective = DirectMetaProperty.ofReadWrite(
                this, "isFirstEffective", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code isLastEffective} property.
         */
        private final MetaProperty<Boolean> isLastEffective = DirectMetaProperty.ofReadWrite(
                this, "isLastEffective", TimeLimit.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code textTimeLimit} property.
         */
        private final MetaProperty<String> textTimeLimit = DirectMetaProperty.ofReadWrite(
                this, "textTimeLimit", TimeLimit.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "id",
                "isStructucted",
                "isSetDay",
                "dayRelation",
                "dayLimit",
                "isSetFH",
                "FHRelation",
                "FHLimit",
                "isSetFC",
                "FCRelation",
                "FCLimit",
                "isSetDayFH",
                "dayFHStart",
                "dayFHLeft",
                "isSetDayFC",
                "dayFCStart",
                "dayFCLeft",
                "isFirstEffective",
                "isLastEffective",
                "textTimeLimit");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 32877702:  // isStructucted
                    return isStructucted;
                case -231780956:  // isSetDay
                    return isSetDay;
                case -1336900168:  // dayRelation
                    return dayRelation;
                case 1913436543:  // dayLimit
                    return dayLimit;
                case 2070733210:  // isSetFH
                    return isSetFH;
                case 1646429406:  // FHRelation
                    return FHRelation;
                case -164529127:  // FHLimit
                    return FHLimit;
                case 2070733205:  // isSetFC
                    return isSetFC;
                case 2093767129:  // FCRelation
                    return FCRelation;
                case -307674882:  // FCLimit
                    return FCLimit;
                case 596802918:  // isSetDayFH
                    return isSetDayFH;
                case -1432000092:  // dayFHStart
                    return dayFHStart;
                case -1016247675:  // dayFHLeft
                    return dayFHLeft;
                case 596802913:  // isSetDayFC
                    return isSetDayFC;
                case -1575145847:  // dayFCStart
                    return dayFCStart;
                case -1020865280:  // dayFCLeft
                    return dayFCLeft;
                case -1714486111:  // isFirstEffective
                    return isFirstEffective;
                case -1094609241:  // isLastEffective
                    return isLastEffective;
                case 293674561:  // textTimeLimit
                    return textTimeLimit;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends TimeLimit> builder() {
            return new DirectBeanBuilder<TimeLimit>(new TimeLimit());
        }

        @Override
        public Class<? extends TimeLimit> beanType() {
            return TimeLimit.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> id() {
            return id;
        }

        /**
         * The meta-property for the {@code isStructucted} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isStructucted() {
            return isStructucted;
        }

        /**
         * The meta-property for the {@code isSetDay} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSetDay() {
            return isSetDay;
        }

        /**
         * The meta-property for the {@code dayRelation} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> dayRelation() {
            return dayRelation;
        }

        /**
         * The meta-property for the {@code dayLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> dayLimit() {
            return dayLimit;
        }

        /**
         * The meta-property for the {@code isSetFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSetFH() {
            return isSetFH;
        }

        /**
         * The meta-property for the {@code FHRelation} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> FHRelation() {
            return FHRelation;
        }

        /**
         * The meta-property for the {@code FHLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> FHLimit() {
            return FHLimit;
        }

        /**
         * The meta-property for the {@code isSetFC} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSetFC() {
            return isSetFC;
        }

        /**
         * The meta-property for the {@code FCRelation} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> FCRelation() {
            return FCRelation;
        }

        /**
         * The meta-property for the {@code FCLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> FCLimit() {
            return FCLimit;
        }

        /**
         * The meta-property for the {@code isSetDayFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSetDayFH() {
            return isSetDayFH;
        }

        /**
         * The meta-property for the {@code dayFHStart} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> dayFHStart() {
            return dayFHStart;
        }

        /**
         * The meta-property for the {@code dayFHLeft} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> dayFHLeft() {
            return dayFHLeft;
        }

        /**
         * The meta-property for the {@code isSetDayFC} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSetDayFC() {
            return isSetDayFC;
        }

        /**
         * The meta-property for the {@code dayFCStart} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> dayFCStart() {
            return dayFCStart;
        }

        /**
         * The meta-property for the {@code dayFCLeft} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> dayFCLeft() {
            return dayFCLeft;
        }

        /**
         * The meta-property for the {@code isFirstEffective} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isFirstEffective() {
            return isFirstEffective;
        }

        /**
         * The meta-property for the {@code isLastEffective} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isLastEffective() {
            return isLastEffective;
        }

        /**
         * The meta-property for the {@code textTimeLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> textTimeLimit() {
            return textTimeLimit;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((TimeLimit) bean).getId();
                case 32877702:  // isStructucted
                    return ((TimeLimit) bean).isIsStructucted();
                case -231780956:  // isSetDay
                    return ((TimeLimit) bean).isIsSetDay();
                case -1336900168:  // dayRelation
                    return ((TimeLimit) bean).getDayRelation();
                case 1913436543:  // dayLimit
                    return ((TimeLimit) bean).getDayLimit();
                case 2070733210:  // isSetFH
                    return ((TimeLimit) bean).isIsSetFH();
                case 1646429406:  // FHRelation
                    return ((TimeLimit) bean).getFHRelation();
                case -164529127:  // FHLimit
                    return ((TimeLimit) bean).getFHLimit();
                case 2070733205:  // isSetFC
                    return ((TimeLimit) bean).isIsSetFC();
                case 2093767129:  // FCRelation
                    return ((TimeLimit) bean).getFCRelation();
                case -307674882:  // FCLimit
                    return ((TimeLimit) bean).getFCLimit();
                case 596802918:  // isSetDayFH
                    return ((TimeLimit) bean).isIsSetDayFH();
                case -1432000092:  // dayFHStart
                    return ((TimeLimit) bean).getDayFHStart();
                case -1016247675:  // dayFHLeft
                    return ((TimeLimit) bean).getDayFHLeft();
                case 596802913:  // isSetDayFC
                    return ((TimeLimit) bean).isIsSetDayFC();
                case -1575145847:  // dayFCStart
                    return ((TimeLimit) bean).getDayFCStart();
                case -1020865280:  // dayFCLeft
                    return ((TimeLimit) bean).getDayFCLeft();
                case -1714486111:  // isFirstEffective
                    return ((TimeLimit) bean).isIsFirstEffective();
                case -1094609241:  // isLastEffective
                    return ((TimeLimit) bean).isIsLastEffective();
                case 293674561:  // textTimeLimit
                    return ((TimeLimit) bean).getTextTimeLimit();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((TimeLimit) bean).setId((Long) newValue);
                    return;
                case 32877702:  // isStructucted
                    ((TimeLimit) bean).setIsStructucted((Boolean) newValue);
                    return;
                case -231780956:  // isSetDay
                    ((TimeLimit) bean).setIsSetDay((Boolean) newValue);
                    return;
                case -1336900168:  // dayRelation
                    ((TimeLimit) bean).setDayRelation((String) newValue);
                    return;
                case 1913436543:  // dayLimit
                    ((TimeLimit) bean).setDayLimit((Date) newValue);
                    return;
                case 2070733210:  // isSetFH
                    ((TimeLimit) bean).setIsSetFH((Boolean) newValue);
                    return;
                case 1646429406:  // FHRelation
                    ((TimeLimit) bean).setFHRelation((String) newValue);
                    return;
                case -164529127:  // FHLimit
                    ((TimeLimit) bean).setFHLimit((Double) newValue);
                    return;
                case 2070733205:  // isSetFC
                    ((TimeLimit) bean).setIsSetFC((Boolean) newValue);
                    return;
                case 2093767129:  // FCRelation
                    ((TimeLimit) bean).setFCRelation((String) newValue);
                    return;
                case -307674882:  // FCLimit
                    ((TimeLimit) bean).setFCLimit((Integer) newValue);
                    return;
                case 596802918:  // isSetDayFH
                    ((TimeLimit) bean).setIsSetDayFH((Boolean) newValue);
                    return;
                case -1432000092:  // dayFHStart
                    ((TimeLimit) bean).setDayFHStart((Date) newValue);
                    return;
                case -1016247675:  // dayFHLeft
                    ((TimeLimit) bean).setDayFHLeft((Double) newValue);
                    return;
                case 596802913:  // isSetDayFC
                    ((TimeLimit) bean).setIsSetDayFC((Boolean) newValue);
                    return;
                case -1575145847:  // dayFCStart
                    ((TimeLimit) bean).setDayFCStart((Date) newValue);
                    return;
                case -1020865280:  // dayFCLeft
                    ((TimeLimit) bean).setDayFCLeft((Integer) newValue);
                    return;
                case -1714486111:  // isFirstEffective
                    ((TimeLimit) bean).setIsFirstEffective((Boolean) newValue);
                    return;
                case -1094609241:  // isLastEffective
                    ((TimeLimit) bean).setIsLastEffective((Boolean) newValue);
                    return;
                case 293674561:  // textTimeLimit
                    ((TimeLimit) bean).setTextTimeLimit((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
