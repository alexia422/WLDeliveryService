
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString(callSuper = true)

public class User {
    private Long userId;
    private String username;
    private String password;
    private String email;
}
