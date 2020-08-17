package com.petstore.api.world;

import com.petstore.api.httpsVerbs.BaseVerb;
import com.petstore.api.httpsVerbs.GetVerb;

public class WorldHelper {


    private static BaseVerb baseVerb;
    private static GetVerb getVerb;


    public BaseVerb baseVerb() {
        if(baseVerb != null) return baseVerb;
        baseVerb = new BaseVerb();
        return baseVerb;
    }


    public GetVerb getVerb() {
        if(getVerb != null) return getVerb;
        getVerb = new GetVerb();
        return getVerb;
    }



}
