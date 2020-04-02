package com.rentermentor.core.mvp.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Tenant")
@Table(name = "tenant")
public class Tenant {

    private int headOfHouseholdTenantNum;
    private String dateOfBirth;
    private String gender;
    private String ethnicGroup;
    private boolean isHispanic;
    private String maritalStatus;
    private boolean isVeteran;
    //An elder is defined as 62 or older
    private boolean isElder;
    //Total number of occupants in the household including applicant
    private int totalNumOfOccupants;
    //A minor is defined as an individual living in the house under the age of 17
    private int numOfMinors;
    //An adult is defined as between the age of 18 - 61
    private int numOfAdults;
    private String currentLivingStatus;
    private String currentCountyOfResidence;
    private boolean isCurrentlyEmployed;
    private boolean isCurrentlyStudent;
    private String highestEducationLevel;
    private boolean isHcvVoucherHolder;
    private String streetAddressOfUnitSubmitted;
    private String cityOfUnitSubmitted;
    private String stateOfUnitSubmitted;
    private long landlordId;
    private boolean isCaseWorkerAssigned;
    private long assignedCaseworkerId;
    //May move optional data into this class
    private OptionalTenantData optional;

    public Tenant() {}

    public Tenant(
            @JsonProperty("headOfHouseholdTenantNum")int headOfHouseholdTenantNum,
            @JsonProperty("dateOfBirth")String dateOfBirth,
            @JsonProperty("gender")String gender,
            @JsonProperty("ethnicGroup")String ethnicGroup,
            @JsonProperty("isHispanic")boolean isHispanic,
            @JsonProperty("maritalStatus")String maritalStatus,
            @JsonProperty("isVeteran")boolean isVeteran,
            @JsonProperty("isElder")boolean isElder,
            @JsonProperty("totalNumOfOccupants")int totalNumOfOccupants,
            @JsonProperty("numOfMinors")int numOfMinors,
            @JsonProperty("numOfAdults")int numOfAdults,
            @JsonProperty("currentLivingStatus")String currentLivingStatus,
            @JsonProperty("currentCountyOfResidence")String currentCountyOfResidence,
            @JsonProperty("isCurrentlyEmployed")boolean isCurrentlyEmployed,
            @JsonProperty("isCurrentlyStudent")boolean isCurrentlyStudent,
            @JsonProperty("highestEducationLevel")String highestEducationLevel,
            @JsonProperty("isHcvVoucherHolder")boolean isHcvVoucherHolder,
            @JsonProperty("streetAddressOfUnitSubmitted")String streetAddressOfUnitSubmitted,
            @JsonProperty("cityOfUnitSubmitted")String cityOfUnitSubmitted,
            @JsonProperty("stateOfUnitSubmitted")String stateOfUnitSubmitted,
            @JsonProperty("landLordId")Long landlordId,
            @JsonProperty("OptionalTenantData")OptionalTenantData optional
            ) {
                this.headOfHouseholdTenantNum = headOfHouseholdTenantNum;
                this.dateOfBirth = dateOfBirth;
                this.gender = gender;
                this.ethnicGroup = ethnicGroup;
                this.isHispanic = isHispanic;
                this.maritalStatus = maritalStatus;
                this.isVeteran = isVeteran;
                this.isElder = isElder;
                this.totalNumOfOccupants = totalNumOfOccupants;
                this.numOfMinors = numOfMinors;
                this.numOfAdults= numOfAdults;
                this.currentLivingStatus = currentLivingStatus;
                this.currentCountyOfResidence = currentCountyOfResidence;
                this.isCurrentlyEmployed = isCurrentlyEmployed;
                this.isCurrentlyStudent = isCurrentlyStudent;
                this.highestEducationLevel = highestEducationLevel;
                this.isHcvVoucherHolder = isHcvVoucherHolder;
                this.streetAddressOfUnitSubmitted = streetAddressOfUnitSubmitted;
                this.cityOfUnitSubmitted = cityOfUnitSubmitted;
                this.stateOfUnitSubmitted = stateOfUnitSubmitted;
                this.landlordId = landlordId;
                this.optional = optional;
              }

}
