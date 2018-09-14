package com.magicleap.pocstreamviewer;

import com.magicleap.pocstreamviewer.model.PersonList;

public interface WebServiceEvents {

    public void onSuccess(PersonList personList);

    public void onFailure(String message);

}
