package MyPackage;


public class SampleClass
{
    public static void main(String[] args) throws Exception
    {

        /*MyThread myThread = new MyThread();
        myThread.start();*/

        /*t1.start();
        t2.start();
        t3.start();*/

        /*SubClass subClass = new SubClass();
        subClass.SubClassPublicMethod();
        subClass.SuperClassPublicMethod();*/

        String jsonAsText = "[{\"_id\":\"12-08-2016_12-47-56\",\"display\":\"Automated test job\",\"run\":{\"_id\":\"12082016124756\",\"sequence\":0,\"displaySequence\":0},\"steps\":[{\"_id\":\"Step_1_id\",\"display\":\"Step 1\",\"actions\":[{\"_id\":\"display\",\"form\":\"https://bitbucket.org/ibright/forms/raw/963cc0380a3e690593876c0d895388115f7d3396/default/view-details.html\"},{\"_id\":\"arrive\",\"display\":\"Arrive\",\"state\":\"arrive\",\"disableForStates\":[\"arrive\",\"process\",\"depart\"]},{\"_id\":\"process\",\"display\":\"Process\",\"state\":\"process\",\"enableForStates\":[\"arrive\"]},{\"_id\":\"depart\",\"display\":\"Depart\",\"state\":\"complete\",\"enableForStates\":[\"process\",\"depart\"]},{\"_id\":\"cancel\",\"display\":\"Cancel\",\"form\":\"https://bitbucket.org/ibright/forms/raw/d57d85057a1ffc6d4560ad05a304c9233d144b44/default/clear-run-vehicle.html?idFormat=%24%7Broute%7D\"}],\"siteId\":\"AucklandPort\",\"siteName\":\"Auckland Port\",\"address\":\"Level 1, Ports of Auckland Building/1 Sunderland St, \\nParnell, \\nAuckland 1010\",\"location\":{\"latitude\":36.8438,\"longitude\":174.7769},\"timeWindow\":{\"from\":\"2016-08-13T00:47:56.000Z\",\"to\":\"2016-08-14T00:47:56.000Z\"}}],\"vehicleId\":\"trucktest\"},{\"_id\":\"12-08-2016_12-50-20\",\"display\":\"Automated test job_12-08-2016_12-50-20\",\"vehicleId\":\"trucktest\",\"run\":null,\"steps\":[{\"_id\":\"TestStep1\",\"display\":\"Step 1\",\"actions\":[{\"_id\":\"display\",\"form\":\"https://bitbucket.org/ibright/forms/raw/963cc0380a3e690593876c0d895388115f7d3396/default/view-details.html\"},{\"_id\":\"arrive\",\"display\":\"Arrive\",\"state\":\"arrive\",\"disableForStates\":[\"arrive\",\"process\",\"depart\"]},{\"_id\":\"process\",\"display\":\"Process\",\"state\":\"process\",\"enableForStates\":[\"arrive\"]},{\"_id\":\"depart\",\"display\":\"Depart\",\"state\":\"complete\",\"enableForStates\":[\"process\",\"depart\"]},{\"_id\":\"skip\",\"confirm\":{\"text\":\"Are you sure?\",\"positiveButton\":\"Yes\",\"negativeButton\":\"No\"},\"display\":\"Skip\"}],\"siteId\":\"AucklandPort\",\"siteName\":\"Auckland Port\",\"address\":\"Level 1, Ports of Auckland Building/1 Sunderland St, \\nParnell, \\nAuckland 1010\",\"location\":{\"latitude\":36.8438,\"longitude\":174.7769},\"timeWindow\":{\"from\":\"2016-08-13T00:50:20.000Z\",\"to\":\"2016-08-14T00:50:20.000Z\"}}]}]";

        String masterString = "Master branch";

    }
}
