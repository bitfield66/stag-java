package com.vimeo.sample.model;

import android.webkit.ValueCallback;

import com.google.gson.annotations.SerializedName;
import com.vimeo.sample_model.ExternalModel1;
import com.vimeo.sample_model.ExternalModelGeneric;
import com.vimeo.stag.UseStag;

@UseStag
public class ExternalModelExample1<T> {

    @SerializedName("stringField")
    public String mStringField;

    @SerializedName("externalExample")
    public ExternalModel1 mExternalModel;

    @SerializedName("externalGenericExample")
    public ExternalModelGeneric<String> mExternalGenericExample;

    @SerializedName("parametrizedExternalGenericExample")
    public ExternalModelGeneric<T> mParametrizedExternalGenericExample;


    @SerializedName("parametrizedInternalGenericExample")
    public GenericClass<T> mParametrizedInternalGenericExample;

    @SerializedName("valueCallback")
    public ValueCallback<T> mReallyUnknownType;
}
