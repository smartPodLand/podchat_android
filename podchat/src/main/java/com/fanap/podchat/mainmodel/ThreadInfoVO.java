package com.fanap.podchat.mainmodel;

import java.io.Serializable;

public class ThreadInfoVO implements Serializable {
    private String image;
    private String description;
    private String metadata;

    public ThreadInfoVO(Builder threadInfoVOBuilder) {
        this.description = threadInfoVOBuilder.description;
        this.image = threadInfoVOBuilder.image;
        this.metadata = threadInfoVOBuilder.metadata;
    }

    public static class Builder {

        private String image;
        private String description;
        private String metadata;

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder metadat(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public ThreadInfoVO build(){
           return new ThreadInfoVO(this);
        }

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }


}
