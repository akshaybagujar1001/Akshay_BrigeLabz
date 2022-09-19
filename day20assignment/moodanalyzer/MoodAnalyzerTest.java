package day20assignment.moodanalyzer;

//import org.hamcrest.CoreMatchers;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class MoodAnalyzerTest {
//
//    @Test
//    public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
//
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad message");
//        String mood = moodAnalyzer.analyzeMood();
//        Assert.assertThat(mood, CoreMatchers.is("SAD"));
//    }
//
//    @Test
//    public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
//
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Happy message");
//        String mood = moodAnalyzer.analyzeMood();
//        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
//    }
//
//    @Test
//    public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {
//
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
//        try {
//            moodAnalyzer.analyzeMood();
//        } catch (MoodAnalyzerException e) {
//            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
//        }
//
//    }
//
//    @Test
//    public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {
//
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
//        try {
//            moodAnalyzer.analyzeMood();
//        } catch (MoodAnalyzerException e) {
//            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
//        }
//    }
//
//}
