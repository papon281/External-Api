package org.reportingapi.dto.request;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class RequestApiRequest {
    @Valid @NotNull
    private String invoiceHash;
    @Valid @NotNull private String uuid;
    @Valid @NotNull private String invoice;

    @Override
    public String toString() {
        return "{" + "\"invoiceHash\":" +"\""+ invoiceHash + '\"' +
                ",\"uuid\":" +"\"" + uuid + '\"' +
                ",\"invoice\":" + "\"" + invoice + '\"' + '}';
    }
}
