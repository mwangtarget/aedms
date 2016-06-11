package com.aedms.core.entities.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;

import com.aedms.core.entities.source.Engine;
import java.util.Map;
import java.util.Set;

import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.BeanBuilder;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.BeanBuilder;

@Entity
@Table(name = "EO_AFF_PUB")
@BeanDefinition
public class EOAffectedPub implements Serializable, Bean {

    private static final long serialVersionUID = 1L;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;
    
    @Column(name="AFF_PUB_TYPE", length=50)
    @PropertyDefinition
    private String affectedPubType;
    
    @Column(name="AFF_PUB_NR", length=50)
    @PropertyDefinition
    private String affectedPubNo;
    
    @Column(name="AFF_PUB_MEMO", length=4000)
    @PropertyDefinition
    private String affectedPubMemo;
    
    @ManyToOne
    @JoinColumn(name="EORDER_ID", nullable=false)
    @PropertyDefinition
    private EOOrder eoder;
    
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code EOAffectedPub}.
     * @return the meta-bean, not null
     */
    public static EOAffectedPub.Meta meta() {
        return EOAffectedPub.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(EOAffectedPub.Meta.INSTANCE);
    }

    @Override
    public EOAffectedPub.Meta metaBean() {
        return EOAffectedPub.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
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
     * Gets the affectedPubType.
     * @return the value of the property
     */
    public String getAffectedPubType() {
        return affectedPubType;
    }

    /**
     * Sets the affectedPubType.
     * @param affectedPubType  the new value of the property
     */
    public void setAffectedPubType(String affectedPubType) {
        this.affectedPubType = affectedPubType;
    }

    /**
     * Gets the the {@code affectedPubType} property.
     * @return the property, not null
     */
    public final Property<String> affectedPubType() {
        return metaBean().affectedPubType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the affectedPubNo.
     * @return the value of the property
     */
    public String getAffectedPubNo() {
        return affectedPubNo;
    }

    /**
     * Sets the affectedPubNo.
     * @param affectedPubNo  the new value of the property
     */
    public void setAffectedPubNo(String affectedPubNo) {
        this.affectedPubNo = affectedPubNo;
    }

    /**
     * Gets the the {@code affectedPubNo} property.
     * @return the property, not null
     */
    public final Property<String> affectedPubNo() {
        return metaBean().affectedPubNo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the affectedPubMemo.
     * @return the value of the property
     */
    public String getAffectedPubMemo() {
        return affectedPubMemo;
    }

    /**
     * Sets the affectedPubMemo.
     * @param affectedPubMemo  the new value of the property
     */
    public void setAffectedPubMemo(String affectedPubMemo) {
        this.affectedPubMemo = affectedPubMemo;
    }

    /**
     * Gets the the {@code affectedPubMemo} property.
     * @return the property, not null
     */
    public final Property<String> affectedPubMemo() {
        return metaBean().affectedPubMemo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoder.
     * @return the value of the property
     */
    public EOOrder getEoder() {
        return eoder;
    }

    /**
     * Sets the eoder.
     * @param eoder  the new value of the property
     */
    public void setEoder(EOOrder eoder) {
        this.eoder = eoder;
    }

    /**
     * Gets the the {@code eoder} property.
     * @return the property, not null
     */
    public final Property<EOOrder> eoder() {
        return metaBean().eoder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public EOAffectedPub clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            EOAffectedPub other = (EOAffectedPub) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getAffectedPubType(), other.getAffectedPubType()) &&
                    JodaBeanUtils.equal(getAffectedPubNo(), other.getAffectedPubNo()) &&
                    JodaBeanUtils.equal(getAffectedPubMemo(), other.getAffectedPubMemo()) &&
                    JodaBeanUtils.equal(getEoder(), other.getEoder());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAffectedPubType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAffectedPubNo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAffectedPubMemo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoder());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(192);
        buf.append("EOAffectedPub{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("affectedPubType").append('=').append(JodaBeanUtils.toString(getAffectedPubType())).append(',').append(' ');
        buf.append("affectedPubNo").append('=').append(JodaBeanUtils.toString(getAffectedPubNo())).append(',').append(' ');
        buf.append("affectedPubMemo").append('=').append(JodaBeanUtils.toString(getAffectedPubMemo())).append(',').append(' ');
        buf.append("eoder").append('=').append(JodaBeanUtils.toString(getEoder())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code EOAffectedPub}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", EOAffectedPub.class, Long.TYPE);
        /**
         * The meta-property for the {@code affectedPubType} property.
         */
        private final MetaProperty<String> affectedPubType = DirectMetaProperty.ofReadWrite(
                this, "affectedPubType", EOAffectedPub.class, String.class);
        /**
         * The meta-property for the {@code affectedPubNo} property.
         */
        private final MetaProperty<String> affectedPubNo = DirectMetaProperty.ofReadWrite(
                this, "affectedPubNo", EOAffectedPub.class, String.class);
        /**
         * The meta-property for the {@code affectedPubMemo} property.
         */
        private final MetaProperty<String> affectedPubMemo = DirectMetaProperty.ofReadWrite(
                this, "affectedPubMemo", EOAffectedPub.class, String.class);
        /**
         * The meta-property for the {@code eoder} property.
         */
        private final MetaProperty<EOOrder> eoder = DirectMetaProperty.ofReadWrite(
                this, "eoder", EOAffectedPub.class, EOOrder.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "affectedPubType",
                "affectedPubNo",
                "affectedPubMemo",
                "eoder");

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
                case -912217405:  // affectedPubType
                    return affectedPubType;
                case 454915978:  // affectedPubNo
                    return affectedPubNo;
                case -912445245:  // affectedPubMemo
                    return affectedPubMemo;
                case 96681767:  // eoder
                    return eoder;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends EOAffectedPub> builder() {
            return new DirectBeanBuilder<EOAffectedPub>(new EOAffectedPub());
        }

        @Override
        public Class<? extends EOAffectedPub> beanType() {
            return EOAffectedPub.class;
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
         * The meta-property for the {@code affectedPubType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> affectedPubType() {
            return affectedPubType;
        }

        /**
         * The meta-property for the {@code affectedPubNo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> affectedPubNo() {
            return affectedPubNo;
        }

        /**
         * The meta-property for the {@code affectedPubMemo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> affectedPubMemo() {
            return affectedPubMemo;
        }

        /**
         * The meta-property for the {@code eoder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<EOOrder> eoder() {
            return eoder;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((EOAffectedPub) bean).getId();
                case -912217405:  // affectedPubType
                    return ((EOAffectedPub) bean).getAffectedPubType();
                case 454915978:  // affectedPubNo
                    return ((EOAffectedPub) bean).getAffectedPubNo();
                case -912445245:  // affectedPubMemo
                    return ((EOAffectedPub) bean).getAffectedPubMemo();
                case 96681767:  // eoder
                    return ((EOAffectedPub) bean).getEoder();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((EOAffectedPub) bean).setId((Long) newValue);
                    return;
                case -912217405:  // affectedPubType
                    ((EOAffectedPub) bean).setAffectedPubType((String) newValue);
                    return;
                case 454915978:  // affectedPubNo
                    ((EOAffectedPub) bean).setAffectedPubNo((String) newValue);
                    return;
                case -912445245:  // affectedPubMemo
                    ((EOAffectedPub) bean).setAffectedPubMemo((String) newValue);
                    return;
                case 96681767:  // eoder
                    ((EOAffectedPub) bean).setEoder((EOOrder) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
