package com.fabro.SpringbootOneToMany.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)   // dont want the default value
public class SelectedItemDTO {

    private String name;
    private String country;

    public SelectedItemDTO(String name, String country) {
        this.name = name;
        this.country = country;
    }

    private String state;

}
