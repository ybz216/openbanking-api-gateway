/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 */
@ApiModel(description = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBBankTransactionCodeStructure1 {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("SubCode")
    private String subCode = null;

    public OBBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Specifies the family within a domain.
     *
     * @return code
     **/
    @JsonProperty("Code")
    @ApiModelProperty(required = true, value = "Specifies the family within a domain.")
    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBBankTransactionCodeStructure1 subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }

    /**
     * Specifies the sub-product family within a specific family.
     *
     * @return subCode
     **/
    @JsonProperty("SubCode")
    @ApiModelProperty(required = true, value = "Specifies the sub-product family within a specific family.")
    @NotNull
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBankTransactionCodeStructure1 obBankTransactionCodeStructure1 = (OBBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, obBankTransactionCodeStructure1.code) &&
                Objects.equals(this.subCode, obBankTransactionCodeStructure1.subCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, subCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBankTransactionCodeStructure1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

