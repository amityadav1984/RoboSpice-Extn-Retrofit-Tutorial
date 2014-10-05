package com.robospice.retrofit.tutorial.pojo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * 
 * Auto generate file
 * http://www.jsonschema2pojo.org/
 * Go to the link give JSON and create corresponding POJO
 * Keep all class inside Main class (in this case Response)
 *  
 */

public class Response {

	@Expose
	private Coord coord;
	@Expose
	private Sys sys;
	@Expose
	private List<Weather> weather = new ArrayList<Weather>();
	@Expose
	private String base;
	@Expose
	private Main main;
	@Expose
	private Wind wind;
	@Expose
	private Clouds clouds;
	@Expose
	private int dt;
	@Expose
	private int id;
	@Expose
	@SerializedName("name")
	private String cityName;
	@Expose
	private int cod;

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return cityName;
	}

	public void setName(String name) {
		this.cityName = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public class Clouds {

		@Expose
		private int all;

		public int getAll() {
			return all;
		}

		public void setAll(int all) {
			this.all = all;
		}

	}	

	public class Coord {

		@Expose
		@SerializedName("lon")
		private float longitude;
		@Expose
		@SerializedName("lat")
		private float latitude;

		public float getLon() {
			return longitude;
		}

		public void setLon(float lon) {
			this.longitude = lon;
		}

		public float getLat() {
			return latitude;
		}

		public void setLat(float lat) {
			this.latitude = lat;
		}

	}	

	public class Main {

		@Expose
		private float temp;
		@Expose
		private int pressure;
		@Expose
		private int humidity;
		@SerializedName("temp_min")
		@Expose
		private float tempMin;
		@SerializedName("temp_max")
		@Expose
		private float tempMax;

		public float getTemp() {
			return temp;
		}

		public void setTemp(float temp) {
			this.temp = temp;
		}

		public int getPressure() {
			return pressure;
		}

		public void setPressure(int pressure) {
			this.pressure = pressure;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

		public float getTempMin() {
			return tempMin;
		}

		public void setTempMin(float tempMin) {
			this.tempMin = tempMin;
		}

		public float getTempMax() {
			return tempMax;
		}

		public void setTempMax(float tempMax) {
			this.tempMax = tempMax;
		}

	}	

	public class Sys {

		@Expose
		private int type;
		@Expose
		private int id;
		@Expose
		private float message;
		@Expose
		private String country;
		@Expose
		private int sunrise;
		@Expose
		private int sunset;

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getMessage() {
			return message;
		}

		public void setMessage(float message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getSunrise() {
			return sunrise;
		}

		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}

		public int getSunset() {
			return sunset;
		}

		public void setSunset(int sunset) {
			this.sunset = sunset;
		}

	}	

	public class Weather {

		@Expose
		private int id;
		@Expose
		private String main;
		@Expose
		private String description;
		@Expose
		private String icon;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

	}	

	public class Wind {

		@Expose
		private float speed;
		@Expose
		private int deg;

		public float getSpeed() {
			return speed;
		}

		public void setSpeed(float speed) {
			this.speed = speed;
		}

		public int getDeg() {
			return deg;
		}

		public void setDeg(int deg) {
			this.deg = deg;
		}

	}	

}
