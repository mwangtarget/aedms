package com.aedms.core.entities.eo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.joda.beans.BeanDefinition;
import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaProperty;

@Entity
@Table(name = "AUTHORITY")
@BeanDefinition
public class Authority implements Serializable, Bean{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;
    
    @Column(name="NAME", length=100)
    @PropertyDefinition
    private String name;
    

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="authority")
    @PropertyDefinition
    private Set<AirworthDirective> airworthDirectives; 
     
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code Authority}.
     * @return the meta-bean, not null
     */
    public static Authority.Meta meta() {
        return Authority.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(Authority.Meta.INSTANCE);
    }

    @Override
    public Authority.Meta metaBean() {
        return Authority.Meta.INSTANCE;
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
     * Gets the name.
     * @return the value of the property
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name  the new value of the property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the airworthDirectives.
     * @return the value of the property
     */
    public Set<AirworthDirective> getAirworthDirectives() {
        return airworthDirectives;
    }

    /**
     * Sets the airworthDirectives.
     * @param airworthDirectives  the new value of the property
     */
    public void setAirworthDirectives(Set<AirworthDirective> airworthDirectives) {
        this.airworthDirectives = airworthDirectives;
    }

    /**
     * Gets the the {@code airworthDirectives} property.
     * @return the property, not null
     */
    public final Property<Set<AirworthDirective>> airworthDirectives() {
        return metaBean().airworthDirectives().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Authority clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Authority other = (Authority) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getName(), other.getName()) &&
                    JodaBeanUtils.equal(getAirworthDirectives(), other.getAirworthDirectives());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAirworthDirectives());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("Authority{");
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
        buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
        buf.append("airworthDirectives").append('=').append(JodaBeanUtils.toString(getAirworthDirectives())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Authority}.
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
                this, "id", Authority.class, Long.TYPE);
        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", Authority.class, String.class);
        /**
         * The meta-property for the {@code airworthDirectives} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<AirworthDirective>> airworthDirectives = DirectMetaProperty.ofReadWrite(
                this, "airworthDirectives", Authority.class, (Class) Set.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "name",
                "airworthDirectives");

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
                case 3373707:  // name
                    return name;
                case 1812179624:  // airworthDirectives
                    return airworthDirectives;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Authority> builder() {
            return new DirectBeanBuilder<Authority>(new Authority());
        }

        @Override
        public Class<? extends Authority> beanType() {
            return Authority.class;
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
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

        /**
         * The meta-property for the {@code airworthDirectives} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Set<AirworthDirective>> airworthDirectives() {
            return airworthDirectives;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((Authority) bean).getId();
                case 3373707:  // name
                    return ((Authority) bean).getName();
                case 1812179624:  // airworthDirectives
                    return ((Authority) bean).getAirworthDirectives();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((Authority) bean).setId((Long) newValue);
                    return;
                case 3373707:  // name
                    ((Authority) bean).setName((String) newValue);
                    return;
                case 1812179624:  // airworthDirectives
                    ((Authority) bean).setAirworthDirectives((Set<AirworthDirective>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
