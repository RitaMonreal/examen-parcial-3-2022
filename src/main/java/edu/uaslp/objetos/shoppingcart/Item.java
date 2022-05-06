package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String code;
    private BigDecimal unitCost;
    private int quantity;
    private String providerCode;


    public Item(String itemCode, String providerCode, BigDecimal unitCost,int quantity){
        this.code = itemCode;
        this.providerCode = providerCode;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public Item() {

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   public void setProviderCode(){
        this.providerCode = providerCode;
   }

   public String getProviderCode(){
        return providerCode;
   }
}
