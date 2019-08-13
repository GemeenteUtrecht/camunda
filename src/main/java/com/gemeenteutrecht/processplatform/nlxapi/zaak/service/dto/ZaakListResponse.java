package com.gemeenteutrecht.processplatform.nlxapi.zaak.service.dto;

import com.gemeenteutrecht.processplatform.domain.Zaak;
import com.gemeenteutrecht.processplatform.domain.impl.ZaakImpl;


import java.net.URI;
import java.util.Collections;
import java.util.List;

public class ZaakListResponse implements ListResponse<Zaak> {

    private int count;
    private URI next;
    private URI previous;
    private List<ZaakImpl> results;

    public ZaakListResponse(){
    }

    public ZaakListResponse(int count, URI next, URI previous, List<ZaakImpl> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public URI next() {
        return next;
    }

    @Override
    public URI previous() {
        return previous;
    }

    @Override
    public List<Zaak> results() {
        return Collections.unmodifiableList(results);
    }
}
