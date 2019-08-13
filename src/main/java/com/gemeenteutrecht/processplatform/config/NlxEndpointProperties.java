package com.gemeenteutrecht.processplatform.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "nlx", ignoreUnknownFields = false)
public class NlxEndpointProperties {

    private URI zaak;

    private URI status;

    private URI document;

    public URI getZaak() {
        return zaak;
    }

    public void setZaak(URI zaak) {
        this.zaak = zaak;
    }

    public URI getStatus() {
        return status;
    }

    public void setStatus(URI status) {
        this.status = status;
    }

    public URI getDocument() { return document; }

    public void setDocument(URI document) {
        this.document = document;
    }
}
