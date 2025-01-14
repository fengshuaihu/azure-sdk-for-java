// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the createRun operation. */
public final class RunNotebooksCreateRunResponse
        extends ResponseBase<RunNotebooksCreateRunHeaders, RunNotebookResponse> {
    /**
     * Creates an instance of RunNotebooksCreateRunResponse.
     *
     * @param request the request which resulted in this RunNotebooksCreateRunResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RunNotebooksCreateRunResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            RunNotebookResponse value,
            RunNotebooksCreateRunHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public RunNotebookResponse getValue() {
        return super.getValue();
    }
}
