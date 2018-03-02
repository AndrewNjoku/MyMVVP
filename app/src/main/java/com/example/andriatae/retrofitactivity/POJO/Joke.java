package com.example.andriatae.retrofitactivity.POJO;



        import android.renderscript.Sampler;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;
       // import org.apache.commons.lang.builder.ToStringBuilder;

public class Joke {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private Value value;

    public Joke (String name,String nameHint){

        value=new Value(name,nameHint);

       // value.setName(name);
      //  value.setNameHint(nameHint);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }


    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", value).toString();
    }
    */

}