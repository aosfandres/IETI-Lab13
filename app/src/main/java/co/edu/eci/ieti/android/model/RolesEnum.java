package co.edu.eci.ieti.android.model;

public enum RolesEnum {
    ADMIN( "admin" ),
    USER( "user" );

    final String role;

    RolesEnum( String role )
    {
        this.role = role;
    }
}
