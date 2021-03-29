/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.model;

/**
 *
 * @author Anjula
 */
public class Tag {
    private int tagCode;
    private String tagName;
    private String relatedTag;

    public int getTagCode() { return tagCode;}
    public void setTagCode(int tagCode) { this.tagCode = tagCode;}
    public String getTagName() { return tagName;}
    public void setTagName(String tagName) { this.tagName = tagName;}
    public String getRelatedTag() { return relatedTag;}
    public void setRelatedTag(String relatedTag) { this.relatedTag = relatedTag; }
       
}
