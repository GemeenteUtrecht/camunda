package com.gemeenteutrecht.processplatform.domain.document.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.gemeenteutrecht.processplatform.domain.document.ObjectType;
import lombok.NonNull;

import java.net.URI;
import java.time.LocalDate;

public interface Document {

    @JsonProperty
    URI url();

    @JsonProperty
    @NonNull
    URI informatieobject();

    @JsonProperty
    URI zaak(); //[ 1 .. 200 ] characters

    @JsonProperty
    String titel();

    @JsonProperty
    String beschrijving();

    @JsonProperty
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "YYYY-MM-dd")
    LocalDate registratiedatum();

}
