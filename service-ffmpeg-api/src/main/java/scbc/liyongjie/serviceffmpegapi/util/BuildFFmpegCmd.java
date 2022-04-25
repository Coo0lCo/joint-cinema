package scbc.liyongjie.serviceffmpegapi.util;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/3/11
 *          简易版本---朴实无华
 *          ffmpeg -i originPath 2>&1 | grep 'Duration' | cut -d ' ' -f 4 | sed s/,//获取视频时长
 *          ffmpeg -i originPath -y -f mjpeg -ss 时长/2 -t 1  md5+thumbnail.jpeg  缩略图生成
 *          ffmpeg -i originPath -c copy -f dash targetPath     dash流生成
 */

public class BuildFFmpegCmd {

    public static String buildDASHCmd(String originPath,String targetPath){
        return ConnectStringUtils.buildPath("ffmpeg -i ",originPath," -c copy -f dash ",targetPath," -loglevel quiet");
    }

    //默认2分钟
    public static String buildThumbnailCmd(String originPath,String targetPath){
        return ConnectStringUtils.buildPath("ffmpeg -i ",originPath," -y -f mjpeg -ss 120 -t 1 ",targetPath," -loglevel quiet");
    }

    public static String buildCalculateDuration(String originPath){
        return ConnectStringUtils.buildPath("ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 -i ",originPath);
    }

}


