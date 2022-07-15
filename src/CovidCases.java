
public class CovidCases implements Comparable<CovidCases> {
  private String country;
  private float lat;
  private float lon;
  private String date;
  private int confirmed;
  private int deaths;
  private int recovered;
  private int active;
  private String whoregion;


  public CovidCases(String country,float lat,float lon,String date,int confirmed, int deaths,int recovered,int active,String whoregion) {
    this.country = country;
    this.lat = lat;
    this.lon = lon;
    this.date = date;
    this.confirmed = confirmed;
    this.deaths = deaths;
    this.recovered = recovered;
    this.active = active;
    this.whoregion = whoregion;
  }

  public String toString() {
    return String.format("%-20s%10f%15f%10d%10d%10d",country,lat,lon, confirmed,deaths, recovered);
  }

  public String getcountry() {
    return country;
  }
  public void setcountry(int country) {
    this.country = String.valueOf(country);
  }
  public float getlat() {
    return lat;
  }
  public void setlat(float lat) {
    this.lat = lat;
  }
  public float getlon() {return  lon;}
  public void setlon(float lon) {
    this.lon = lon;
  }
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public int getConfirmed() {
    return confirmed;
  }
  public void setConfirmed(int confirmed) {
    this.confirmed = confirmed;
  }
  public int getDeaths() {
    return deaths;
  }
  public void setDeaths(int deaths) {
    this.deaths = deaths;
  }
  public int getRecovered() {
    return recovered;
  }
  public void setRecovered(int recovered) {
    this.recovered = recovered;
  }
  public int getActive() {
    return active;
  }
  public void setActive(int active) {
    this.active = active;
  }
  public String getWhoregion() {
    return whoregion;
  }
  public void setWhoregion(String whoregion) {
    this.whoregion = whoregion;
  }
  public int compareTo(CovidCases ac) {
    return Integer.compare(active, ac.active);
  }
}
