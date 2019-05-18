package com.cithub.admin.cithub_admin.model;

import java.util.Date;

public class serviceBean {
    private Integer id;

    private String title;

    private String type;

    private String tags;

    private Integer userId;

    private String url;

    private String healthcheckUrl;

    private String img;

    private String repository;

    private String license;

    private String description;

    private String shortDesc;

    private Date date;

    private String dockerImage;

    private String version;

    private Integer originalVersionId;

    private String inputFormat;

    private String outputFormat;

    private String dockerUrl;

    private Integer checkflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHealthcheckUrl() {
        return healthcheckUrl;
    }

    public void setHealthcheckUrl(String healthcheckUrl) {
        this.healthcheckUrl = healthcheckUrl == null ? null : healthcheckUrl.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository == null ? null : repository.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc == null ? null : shortDesc.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDockerImage() {
        return dockerImage;
    }

    public void setDockerImage(String dockerImage) {
        this.dockerImage = dockerImage == null ? null : dockerImage.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getOriginalVersionId() {
        return originalVersionId;
    }

    public void setOriginalVersionId(Integer originalVersionId) {
        this.originalVersionId = originalVersionId;
    }

    public String getInputFormat() {
        return inputFormat;
    }

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat == null ? null : inputFormat.trim();
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat == null ? null : outputFormat.trim();
    }

    public String getDockerUrl() {
        return dockerUrl;
    }

    public void setDockerUrl(String dockerUrl) {
        this.dockerUrl = dockerUrl == null ? null : dockerUrl.trim();
    }

    public Integer getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(Integer checkflag) {
        this.checkflag = checkflag;
    }
}