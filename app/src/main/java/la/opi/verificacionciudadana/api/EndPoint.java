package la.opi.verificacionciudadana.api;

/**
 * Created by Jhordan on 24/02/15.
 */
public class EndPoint {

    public final static String PITAGORAS_API = "http://staging.pitagoras.opi.la";
    public final static String MEXICO_STATES = "/api/admin1/index_with_admin2";
    public final static String USER_SIGN_UP = "/users/create.json";
    public final static String USER_SIGN_IN = "/users/sign_in";
    public final static String HOME= "/home";
    public final static String OCURRENCES = "/occurrences.json";


    public final static String FIELD_AUTHENTICITY_TOKEN = "authenticity_token";
    public final static String FIELD_UTF_8 = "utf8";
    public final static String FIELD_USER_NAME = "user[name]";
    public final static String FIELD_USER_MAIL = "user[email]";
    public final static String FIELD_USER_ROLE = "user[role_id]";
    public final static String FIELD_USER_STATE = "user[ciudadano_admin1_id]";
    public final static String FIELD_USER_TOWN = "user[ciudadano_admin2_id]";
    public final static String FIELD_USER_PASSWORD = "user[password]";
    public final static String FIELD_USER_CONFIRMATION = "user[password_confirmation]";
    public final static String FIELD_COMMIT = "commit";
    public final static String FIELD_USER_REMEMBER_ME = "user[remember_me]";

    public final static String HEADER_USER_AGENT = "User-Agent";
    public final static String HEADER_AGENT_NAME = "YoVerifico-Android-OPI";

    public final static String PARAMETER_REMEMBERME = "0";
    public final static String PARAMETER_COMMIT_SIGN_IN = "Acceder";
    public final static String PARAMETER_COMMIT_SIGN_UP = "Save";
    public final static String PARAMETER_UTF8 = "&#x2713";
    public final static String PARAMETER_USER_ROLE = "9";


}