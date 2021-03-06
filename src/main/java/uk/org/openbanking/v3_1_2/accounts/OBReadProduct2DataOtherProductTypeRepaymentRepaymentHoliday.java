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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of capital repayment holiday if any
 */
@ApiModel(description = "Details of capital repayment holiday if any")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday {
    @JsonProperty("MaxHolidayPeriod")
    private MaxHolidayPeriodEnum maxHolidayPeriod = null;
    @JsonProperty("MaxHolidayLength")
    private Integer maxHolidayLength = null;
    @JsonProperty("Notes")
    private List<String> notes = null;

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
        return this;
    }

    /**
     * The unit of period (days, weeks, months etc.) of the repayment holiday
     *
     * @return maxHolidayPeriod
     **/
    @JsonProperty("MaxHolidayPeriod")
    @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the repayment holiday")
    public MaxHolidayPeriodEnum getMaxHolidayPeriod() {
        return maxHolidayPeriod;
    }

    public void setMaxHolidayPeriod(MaxHolidayPeriodEnum maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday maxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
        return this;
    }

    /**
     * The maximum length/duration of a Repayment Holiday
     *
     * @return maxHolidayLength
     **/
    @JsonProperty("MaxHolidayLength")
    @ApiModelProperty(value = "The maximum length/duration of a Repayment Holiday")
    public Integer getMaxHolidayLength() {
        return maxHolidayLength;
    }

    public void setMaxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxHolidayPeriod, maxHolidayLength, notes);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday) o;
        return Objects.equals(this.maxHolidayPeriod, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.maxHolidayPeriod) &&
                Objects.equals(this.maxHolidayLength, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.maxHolidayLength) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday.notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday {\n");

        sb.append("    maxHolidayPeriod: ").append(toIndentedString(maxHolidayPeriod)).append("\n");
        sb.append("    maxHolidayLength: ").append(toIndentedString(maxHolidayLength)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

    /**
     * The unit of period (days, weeks, months etc.) of the repayment holiday
     */
    public enum MaxHolidayPeriodEnum {
        PACT("PACT"),

        PDAY("PDAY"),

        PHYR("PHYR"),

        PMTH("PMTH"),

        PQTR("PQTR"),

        PWEK("PWEK"),

        PYER("PYER");

        private String value;

        MaxHolidayPeriodEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static MaxHolidayPeriodEnum fromValue(String text) {
            for (MaxHolidayPeriodEnum b : MaxHolidayPeriodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

