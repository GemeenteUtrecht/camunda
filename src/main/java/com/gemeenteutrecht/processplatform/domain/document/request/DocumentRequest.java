package com.gemeenteutrecht.processplatform.domain.document.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.gemeenteutrecht.processplatform.domain.document.impl.ObjectType;
import lombok.NonNull;

import java.net.URI;
import java.time.LocalDate;

public interface DocumentRequest {

    @JsonProperty
    URI url();

    @JsonProperty
    @NonNull
    URI informatieobject();

    @JsonProperty
    @NonNull
    URI object(); //[ 1 .. 200 ] characters

    @JsonProperty
    @NonNull
    ObjectType objectType();

    @JsonProperty
    String titel();

    @JsonProperty
    String beschrijving();

    void addObject(URI object);

    void addUrl(URI url);
}
