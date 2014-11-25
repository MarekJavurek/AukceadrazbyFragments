package biz.netdevelopers.aukceadrazbyfragments.interfaces;

import java.util.ArrayList;

import biz.netdevelopers.aukceadrazbyfragments.model.AuctionObject;

public interface INotifyTaskCompleted {
    void DataChanged(ArrayList<AuctionObject> list);
}
