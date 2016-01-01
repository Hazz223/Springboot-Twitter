package application.web.dto;

/**
 * Created by Harry on 01/01/2016.
 */
public class MessageDto {

    private String message;

    //region Public Methods

    public MessageDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    //endregion

    //region Private Methods

    //endregion

}
