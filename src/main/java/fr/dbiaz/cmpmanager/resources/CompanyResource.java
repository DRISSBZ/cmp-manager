package fr.dbiaz.cmpmanager.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyResource {

    private String name;
    private String siretNumber;
    private String address;
    private String city;
    private String postCode;
    private String logo;
    private String country;

}
