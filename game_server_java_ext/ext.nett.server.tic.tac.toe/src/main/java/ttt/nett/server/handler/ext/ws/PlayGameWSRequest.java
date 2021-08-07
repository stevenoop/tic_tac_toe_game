package ttt.nett.server.handler.ext.ws;

import org.json.JSONObject;
import org.slf4j.Logger;

import nett.server.st.game.Instantiation;
import nett.server.st.game.entity.User;
import nett.server.st.game.exception.GException;
import nett.server.st.game.extension.BaseClientRequestHandler;
import ttt.nett.server.log.LogExt;

@Instantiation(Instantiation.InstantiationMode.SINGLE_INSTANCE)
public class PlayGameWSRequest extends BaseClientRequestHandler {
	private static Logger log = LogExt.getLogApp(PlayGameWSRequest.class);

	@Override
	public void handleClientRequest(User sender, JSONObject params) throws GException {
		log.debug(params.toString());
		
	}

}
