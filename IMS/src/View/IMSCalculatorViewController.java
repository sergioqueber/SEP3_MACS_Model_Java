package View;

import Model.ModelIMS;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Region;

import java.net.URL;
import java.util.ResourceBundle;

public class IMSCalculatorViewController implements Initializable
{

  private Region root;
  private ModelIMS model;
  private ViewHandler2 viewHandler2;

  @FXML private NumberAxis CSaxis;

  @FXML private NumberAxis MAaxis;

  @FXML private BubbleChart<Double, Double> bubbleChart;

  public IMSCalculatorViewController() {}

  public Region getRoot()
  {
    return root;
  }

  public void init(ViewHandler2 viewHandler2, Region root, ModelIMS model)
  {
    this.viewHandler2 = viewHandler2;
    this.root = root;
    this.model = model;
  }

  //XYChart.Series series1 = new XYChart.Series();
  //XYChart.Series series2 = new XYChart.Series();


  @Override public void initialize(URL location, ResourceBundle resources)
  {
    XYChart.Series series = new XYChart.Series();
    for (int i = 0; i < model.getList3().getCountries().size(); i++)
    {
      series.setName(model.getList3().getCountry(i).getName());
      series.getData().add(new XYChart.Data(
          (model.getList3().getCountries().get(i).getCompetitiveStrengthPunctuation()),
          (model.getList3().getCountries().get(i).getMarketAttractivenessPunctuation()),0.5));
      bubbleChart.getData().add(series);


/*
   bubbleChart.getXAxis().setLabel("Competitive Strength");
    bubbleChart.getYAxis().setLabel("Market Attractiveness");

    series1.setName("Australia");
    series1.getData().add(new XYChart.Data(3,4,0.5));

    series2.setName("Japon");
    series2.getData().add(new XYChart.Data(2,1,0.5));

    bubbleChart.getData().addAll(series1, series2);
*/

    }
  }
}
