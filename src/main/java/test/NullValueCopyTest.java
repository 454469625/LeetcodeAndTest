package test;

import java.time.LocalDate;

public class NullValueCopyTest {
    public static void main(String[] args) {
        entity1 entity1 = new entity1();
        entity2 entity2 = new entity2();
        entity1.setFirstPurchaseOrderDate(entity2.getFirstPurchaseOrderDate());
        System.out.println(1);
        entity1.setFirstSaleOrderDate(entity2.getFirstSaleOrderDate());
        System.out.println(2);
        entity1.setHavePurchaseCooperation(entity2.getHavePurchaseCooperation());
        System.out.println(3);
        entity1.setHaveSaleCooperation(entity2.getHaveSaleCooperation());
        System.out.println(4);
    }
}

class entity1 {
    /**
     * 是否已有销售合作（1：已合作，0：未合作）
     */
    private Integer haveSaleCooperation;
    /**
     * 首单销售合同日期
     */
    private LocalDate firstSaleOrderDate;
    /**
     * 是否已有采购合作（1：已合作，0：未合作）
     */
    private Integer havePurchaseCooperation;
    /**
     * 收单采购合同日期
     */
    private LocalDate firstPurchaseOrderDate;

    public Integer getHaveSaleCooperation() {
        return haveSaleCooperation;
    }

    public void setHaveSaleCooperation(Integer haveSaleCooperation) {
        this.haveSaleCooperation = haveSaleCooperation;
    }

    public LocalDate getFirstSaleOrderDate() {
        return firstSaleOrderDate;
    }

    public void setFirstSaleOrderDate(LocalDate firstSaleOrderDate) {
        this.firstSaleOrderDate = firstSaleOrderDate;
    }

    public Integer getHavePurchaseCooperation() {
        return havePurchaseCooperation;
    }

    public void setHavePurchaseCooperation(Integer havePurchaseCooperation) {
        this.havePurchaseCooperation = havePurchaseCooperation;
    }

    public LocalDate getFirstPurchaseOrderDate() {
        return firstPurchaseOrderDate;
    }

    public void setFirstPurchaseOrderDate(LocalDate firstPurchaseOrderDate) {
        this.firstPurchaseOrderDate = firstPurchaseOrderDate;
    }
}

class entity2 {
    /**
     * 是否已有销售合作（1：已合作，0：未合作）
     */
    private Integer haveSaleCooperation;
    /**
     * 首单销售合同日期
     */
    private LocalDate firstSaleOrderDate;
    /**
     * 是否已有采购合作（1：已合作，0：未合作）
     */
    private Integer havePurchaseCooperation;
    /**
     * 收单采购合同日期
     */
    private LocalDate firstPurchaseOrderDate;

    public Integer getHaveSaleCooperation() {
        return haveSaleCooperation;
    }

    public void setHaveSaleCooperation(Integer haveSaleCooperation) {
        this.haveSaleCooperation = haveSaleCooperation;
    }

    public LocalDate getFirstSaleOrderDate() {
        return firstSaleOrderDate;
    }

    public void setFirstSaleOrderDate(LocalDate firstSaleOrderDate) {
        this.firstSaleOrderDate = firstSaleOrderDate;
    }

    public Integer getHavePurchaseCooperation() {
        return havePurchaseCooperation;
    }

    public void setHavePurchaseCooperation(Integer havePurchaseCooperation) {
        this.havePurchaseCooperation = havePurchaseCooperation;
    }

    public LocalDate getFirstPurchaseOrderDate() {
        return firstPurchaseOrderDate;
    }

    public void setFirstPurchaseOrderDate(LocalDate firstPurchaseOrderDate) {
        this.firstPurchaseOrderDate = firstPurchaseOrderDate;
    }
}
