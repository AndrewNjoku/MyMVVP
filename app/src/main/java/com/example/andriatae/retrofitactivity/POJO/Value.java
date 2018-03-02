package com.example.andriatae.retrofitactivity.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Andria TAE on 02/03/2018.
 */


    public class Value {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("joke")
        @Expose
        private String joke;
        @SerializedName("categories")
        @Expose
        public String name;
        public String nameHint;

        private List<String> categories = null;

        //creating a constructor, just for testing purpouses

    public Value (String name,String nameHint){

        this.name=name;
        this.nameHint=nameHint;

    }



    public String getNameHint() {
        return nameHint;
    }

    public void setNameHint(String name) {
        this.nameHint= name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }

        public List<String> getCategories() {
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }
/*
        @Override
        public String toString() {
            return new ToStringBuilder(this).append("id", id).append("joke", joke).append("categories", categories).toString();
        }
*/
    }
