package Modelos;

import Interfaces.OfferMethods;

public class Offers implements OfferMethods {
    private double offerThisCult;
    private double allOffers;

    public double getValue ( ) {
        return this.offerThisCult;
    }

    public void setValue ( double value ) {
        this.offerThisCult = value;
    }

    public void setAllOffers ( ) {
        this.allOffers += offerThisCult;
    }

    public double calculateOffers() {
        double value = offerThisCult + allOffers;

        return value;
    }

}
