package com.example.module309.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString

public class CreateProductFormBean {
    private Integer id;

    @NotEmpty(message="Please provide product code")
    private String productCode;
    @NotEmpty(message="Please provide product name")
    private String productName;
    @NotNull(message="Please provide product product line ID")
    private Integer productlineId;

    @NotEmpty(message="Please provide product scale")
    private String productScale;
    @NotEmpty(message="Please provide product vendor")
    private String productVendor;
    @NotEmpty(message="Please provide the product Description")
    private String productDescription;
    @NotNull(message="Please provide the Quantity InStock")
    private Integer quantityInStock;
    @NotNull(message="Please provide the Selling Price")
    private Double buyPrice;
    @NotNull(message="Please provide the msrp")
    private double msrp;


}
