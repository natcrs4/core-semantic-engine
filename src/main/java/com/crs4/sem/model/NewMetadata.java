package com.crs4.sem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.search.annotations.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region="metadata")
@Table( name="NEWMETADATA" )
@Indexed
@EqualsAndHashCode
//@ClassBridge(impl=MetadataBridge.class)
public class NewMetadata {
@Id
@JsonIgnore
@EqualsAndHashCode.Exclude
private String id;

@Lob
//@Field(index=Index.YES, analyze=Analyze.NO, store=Store.YES)
private String url;

@Lob
//@Field(index=Index.YES, analyze=Analyze.NO, store=Store.YES)
@EqualsAndHashCode.Exclude 
private String newurl;

@Lob
//@Field(index=Index.YES, analyze=Analyze.NO, store=Store.YES)
@EqualsAndHashCode.Exclude 
private Float duration;

@Lob
//@Field(index=Index.YES, analyze=Analyze.YES, store=Store.YES)
@EqualsAndHashCode.Exclude 
private String title;

@Lob
//@Field(index=Index.YES, analyze=Analyze.YES, store=Store.YES)
@EqualsAndHashCode.Exclude 
private String description;
 
@Lob
//@Field(index=Index.YES, analyze=Analyze.NO, store=Store.YES)
@EqualsAndHashCode.Exclude 
private String poster;


@Lob
//@Field(index=Index.YES, analyze=Analyze.NO, store=Store.YES)
@EqualsAndHashCode.Exclude 
private String format;

public NewMetadata(String url) {
    String md5 = DigestUtils.md5Hex(url);
    this.setUrl(url);
    this.setId(md5);
}

}
