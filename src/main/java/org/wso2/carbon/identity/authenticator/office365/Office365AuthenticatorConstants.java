package org.wso2.carbon.identity.authenticator.office365;

public class Office365AuthenticatorConstants {
    public static final String AUTHENTICATOR_NAME = "Office365Authenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "Office365";
    //office365 authorize endpoint URL
    public static final String office365_OAUTH_ENDPOINT = "https://login.microsoftonline.com/common/oauth2/authorize";
    //office365 token  endpoint URL
    public static final String office365_TOKEN_ENDPOINT = "https://login.microsoftonline.com/common/oauth2/token";
    //office365 user info endpoint URL
    public static final String office365_USERINFO_ENDPOINT = "https://outlook.office365.com/api/v2.0/me";
    public static final String Resource = "resource";
    // The client ID of the client application that is registered in Azure AD.
    public static final String CLIENT_ID = "client_id";
    //The reply URL of the application.
    public static final String CALLBACK_URL = "callbackUrl";
    //The ID of the user
    public static final String ID = "Id";
    //The authorization code that the application requested.
    public static final String CODE = "code";
    //The response type
    public static final String RESPONSE_TYPE = "response_type";
    //Specifies the reply URL of the application.
    public static final String REDIRECT_URI = "redirect_uri";
    //The App ID URI of the web API
    public static final String OFFICE365_RESOURCE = "https://outlook.office.com";
    //The Http get method
    public static final String HTTP_GET = "GET";
    //The Accept header
    public static final String HEADER_ACCEPT = "ACCEPT";
    //The value of the Accept header
    public static final String ODATA_ACCEPT_HEADER = "application/json;odata.metadata=minimal";
    //The Authorization header
    public static final String Authorization = "Authorization";
    //The Bearer type
    public static final String BEARER = "Bearer ";
    //A randomly generated non-reused value that is sent in the request and returned in the response.
    public static final String STATE = "state";
    //Username of the requested user.
    public static final String USER = "username";
}