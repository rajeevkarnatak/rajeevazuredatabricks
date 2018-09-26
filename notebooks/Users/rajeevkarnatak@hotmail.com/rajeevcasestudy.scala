// Databricks notebook source
val defaultMoviesUrl = "https://rajeevstoarageaccount.blob.core.windows.net/datalakecontainer/movies.csv"
val defaultRatingsUrl = "adl://iomegadatalakestore.azuredatalakestore.net/data/ratings.csv"
 
val moviesUrl = dbutils.widgets.text("moviesUrl","")
val ratingsUrl = dbutils.widgets.text("ratingsUrl", "")
 
var inputMoviesUrl = dbutils.widgets.get("moviesUrl")
 
if(inputMoviesUrl == null) {
  inputMoviesUrl = defaultMoviesUrl
}
 
var inputRatingsUrl = dbutils.widgets.get("ratingsUrl")
 
if(inputRatingsUrl == null) {
  inputRatingsUrl = defaultRatingsUrl
}

// COMMAND ----------

