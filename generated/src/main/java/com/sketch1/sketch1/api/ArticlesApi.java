/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sketch1.sketch1.api;

import com.sketch1.sketch1.dto.ArticleDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-23T14:10:18.052568617-04:00[America/Toronto]")
@Validated
@Api(value = "articles", description = "the articles API")
public interface ArticlesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /articles
     *
     * @return Sucessfull operation (status code 200)
     */
    @ApiOperation(value = "", nickname = "getListofArticle", notes = "", response = ArticleDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucessfull operation", response = ArticleDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/articles",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ArticleDto>> _getListofArticle() {
        return getListofArticle();
    }

    // Override this method
    default  ResponseEntity<List<ArticleDto>> getListofArticle() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"artPrice\" : 6.027456183070403, \"artName\" : \"artName\", \"artCode\" : \"artCode\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
