import base.CommonAPI;


public class SearchFeatures extends CommonAPI {
    public void searchMenu(){
        typeOnElementNEnter("#twotabsearchtextbox","Flash Drive");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Drill Machine");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Samsung TV");
    }
}
