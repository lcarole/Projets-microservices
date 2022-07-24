/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ErrorResponse;
import org.openapitools.model.SubscriptionRequest;
import org.openapitools.model.SubscriptionResponse;
import org.openapitools.model.SubscriptionsResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
@Validated
@Api(value = "subscriptions", description = "the subscriptions API")
public interface SubscriptionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /subscriptions/{subscriptionRef} : Read Subscription
     * Get an existing Subscription
     *
     * @param subscriptionRef External identifier of the subscription (required)
     * @return OK (status code 200)
     *         or ERROR - Not authenticated (status code 401)
     *         or ERROR - Access token does not have the required scope (status code 403)
     *         or ERROR - Internal Server error (status code 500)
     */
    @ApiOperation(value = "Read Subscription", nickname = "getSubscription", notes = "Get an existing Subscription", response = SubscriptionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKey"),
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "write", description = "Grants write access") })
         }, tags={ "PHASE 1","Subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubscriptionResponse.class),
        @ApiResponse(code = 401, message = "ERROR - Not authenticated", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "ERROR - Access token does not have the required scope", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "ERROR - Internal Server error", response = ErrorResponse.class) })
    @GetMapping(
        value = "/subscriptions/{subscriptionRef}",
        produces = { "application/json" }
    )
    default ResponseEntity<SubscriptionResponse> getSubscription(@ApiParam(value = "External identifier of the subscription",required=true) @PathVariable("subscriptionRef") String subscriptionRef) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SubscriptionRequest\" : { \"$ref\" : \"#/components/examples/SubscriptionRequest\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /subscriptions/{subscriptionRef} : Patch Subscription
     * Update an existing Subscription
     *
     * @param subscriptionRef External identifier of the subscription (required)
     * @param subscriptionRequest  (optional)
     * @return OK (status code 200)
     *         or ERROR - Invalid object request (status code 400)
     *         or ERROR - Not authenticated (status code 401)
     *         or ERROR - Access token does not have the required scope (status code 403)
     *         or ERROR - Internal Server error (status code 500)
     */
    @ApiOperation(value = "Patch Subscription", nickname = "patchSubscription", notes = "Update an existing Subscription", response = SubscriptionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKey"),
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "write", description = "Grants write access") })
         }, tags={ "PHASE 1","Subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubscriptionResponse.class),
        @ApiResponse(code = 400, message = "ERROR - Invalid object request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "ERROR - Not authenticated", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "ERROR - Access token does not have the required scope", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "ERROR - Internal Server error", response = ErrorResponse.class) })
    @PutMapping(
        value = "/subscriptions/{subscriptionRef}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SubscriptionResponse> patchSubscription(@ApiParam(value = "External identifier of the subscription",required=true) @PathVariable("subscriptionRef") String subscriptionRef,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) SubscriptionRequest subscriptionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SubscriptionRequest\" : { \"$ref\" : \"#/components/examples/SubscriptionRequest\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /subscriptions : Add Subscriptions
     * Add a new Subscription
     *
     * @param subscriptionRequest  (optional)
     * @return SUCCESS - Subscription created (status code 201)
     *         or ERROR - Invalid object request (status code 400)
     *         or ERROR - Not authenticated (status code 401)
     *         or ERROR - Access token does not have the required scope (status code 403)
     *         or ERROR - Internal Server error (status code 500)
     */
    @ApiOperation(value = "Add Subscriptions", nickname = "postSubscription", notes = "Add a new Subscription", response = SubscriptionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKey"),
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "write", description = "Grants write access") })
         }, tags={ "PHASE 1","Subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "SUCCESS - Subscription created", response = SubscriptionResponse.class),
        @ApiResponse(code = 400, message = "ERROR - Invalid object request", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "ERROR - Not authenticated", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "ERROR - Access token does not have the required scope", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "ERROR - Internal Server error", response = ErrorResponse.class) })
    @PostMapping(
        value = "/subscriptions",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SubscriptionResponse> postSubscription(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) SubscriptionRequest subscriptionRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SubscriptionRequest\" : { \"$ref\" : \"#/components/examples/SubscriptionRequest\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /subscriptions : Search Subscriptions
     * Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions
     *
     * @param contractRef External identifier of the deferred billing contract for the customer (optional)
     * @param customerRef External identifier of the buyer (optional)
     * @param contractStatus Contract Status (optional)
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the list to be displayed (optional)
     * @return SUCCESS - Returns a list of Subscriptions (status code 200)
     *         or ERROR - Not authenticated (status code 401)
     *         or ERROR - Access token does not have the required scope (status code 403)
     *         or ERROR - Internal Server error (status code 500)
     */
    @ApiOperation(value = "Search Subscriptions", nickname = "searchSubscriptions", notes = "Multi-criteria search for subscriptions. The result is a list (maybe empty) of subscriptions", response = SubscriptionsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKey"),
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Grants read access") })
         }, tags={ "PHASE 1","Subscriptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "SUCCESS - Returns a list of Subscriptions", response = SubscriptionsResponse.class),
        @ApiResponse(code = 401, message = "ERROR - Not authenticated", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "ERROR - Access token does not have the required scope", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "ERROR - Internal Server error", response = ErrorResponse.class) })
    @GetMapping(
        value = "/subscriptions",
        produces = { "application/json" }
    )
    default ResponseEntity<SubscriptionsResponse> searchSubscriptions(@ApiParam(value = "External identifier of the deferred billing contract for the customer") @Valid @RequestParam(value = "contractRef", required = false) String contractRef,@ApiParam(value = "External identifier of the buyer") @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@ApiParam(value = "Contract Status") @Valid @RequestParam(value = "contractStatus", required = false) String contractStatus,@ApiParam(value = "Limits the number of items on a page") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Specifies the page number of the list to be displayed") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SubscriptionsResponse\" : { \"$ref\" : \"#/components/examples/SubscriptionsResponse\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}