/* Powered by NAIF. Generated by NAIF v.rc2-1.0.0*/
package com.naif.domains.models;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;

import java.lang.Override;

import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Version;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OrderBy;

import javax.xml.bind.annotation.XmlRootElement;

import com.naif.domains.models.Attributes;

@NamedQueries({
  @NamedQuery(name = "TypesAttributes.findAll",
              query = "select o from TypesAttributes o"),

  @NamedQuery(name = "TypesAttributes.findId",
              query = "select o from TypesAttributes o where o.id = :id")
})
@XmlRootElement
@Entity
@Table(name = "typesAttributes", catalog="", schema="")

public class TypesAttributes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer optlock;

    private String type;
    private String observaciones;
    private double orden;

    // Uno a Muchos Bidireccional No.5:Attributes
    @OneToMany(mappedBy="typesAttributes",
               fetch=FetchType.LAZY, targetEntity=void.class)
    private Set<Attributes> attributes = new HashSet<Attributes>(0);



    @Id
    private @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id = null;
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    @Column(name = "optlock", nullable=true, unique=false, length=0, precision=0, columnDefinition="")
    public Integer getOptlock() {
        return this.optlock;
    }

    public void setOptlock(Integer optlock) {
        this.optlock = optlock;
    }

    
    @Column(name = "type", nullable=false, unique=false, length=0, precision=0, columnDefinition="")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name = "observaciones", nullable=false, unique=false, length=0, precision=0, columnDefinition="")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Column(name = "orden", nullable=true, unique=false, length=0, precision=0, columnDefinition="")
    public double getOrden() {
        return this.orden;
    }

    public void setOrden(double orden) {
        this.orden = orden;
    }

// Relaciones
    // Uno a Muchos Bidireccional No.5:Attributes
    public Set<Attributes> getAttributes() {
        return this.attributes;
    }
    public void setAttributes(Set<Attributes> attributes) {
        this.attributes = attributes;
    }


} // Fin de la clase