public class Test
{
  public static void main(String[] args)
  {
    QuantitativeFactor factor1 = new QuantitativeFactor("gdp",23,43,true,10000000);
    //QuantitativeFactor factor2 = new QuantitativeFactor("gdp",23,43,true,20000000);
    //QuantitativeFactor factor3 = new QuantitativeFactor("gdp",23,43,true,30000000);

    QuantitativeFactorList list = new QuantitativeFactorList();
    list.addFactor(factor1);

    QualitativeFactorList list2 = new QualitativeFactorList();


    Country country1 = new Country("Australia",list2, list);
    Country country2 = new Country("Austria",list2, list);
    Country country3 = new Country("China",list2, list);

    country2.setQuantitativeValue(0,20000000);
    country3.setQuantitativeValue(0,30000000);

    System.out.println(country3.getQuantitativeFactors().getFactor(0).getValue());
    System.out.println(country2.getQuantitativeFactors().getValue(0));

    CountryList listOfCountries = new CountryList();
    listOfCountries.addCountry(country1);
    listOfCountries.addCountry(country2);
    listOfCountries.addCountry(country3);

    listOfCountries.defineRange();
    System.out.println(listOfCountries.getRanges());

    listOfCountries.assignQuantitativePoints();
    System.out.println(listOfCountries.getCountry(1).getQuantitativeFactors().getFactor(0).getPoint());



  }
}
