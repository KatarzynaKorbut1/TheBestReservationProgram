package services.interfaces;

import services.InvalidEmailException;
import services.InvalidPasswordException;

import java.io.IOException;

public interface ProcessCommand {

    void processCommand(int cmd) throws InvalidPasswordException, IOException, InvalidEmailException;

}
