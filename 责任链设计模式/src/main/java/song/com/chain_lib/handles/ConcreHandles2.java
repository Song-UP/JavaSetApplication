package song.com.chain_lib.handles;

import com.example.responchain.Handle;
import com.example.responchain.Level;
import com.example.responchain.Request;
import com.example.responchain.Response;

/**
 * Created by SongUp on 2018/5/23.
 */

public class ConcreHandles2 extends Handle{
    @Override
    public Level getHandleLevel() {
        return new Level(2);
    }
    @Override
    public Response response(Request request) {
        System.out.print("该请求已 2 被相应");
        return new Response("相应结果 2");
    }
}
