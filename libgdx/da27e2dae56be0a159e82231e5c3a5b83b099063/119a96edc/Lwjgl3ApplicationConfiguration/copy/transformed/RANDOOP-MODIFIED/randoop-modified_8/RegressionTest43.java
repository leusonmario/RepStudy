import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test21501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount((-65486));
        int int15 = lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion;
        int int16 = lwjgl3ApplicationConfiguration10.getgles30ContextMajorVersion();
        int int17 = lwjgl3ApplicationConfiguration10.r;
        lwjgl3ApplicationConfiguration10.r = (-4626);
        java.lang.String str20 = lwjgl3ApplicationConfiguration10.preferencesDirectory;
        lwjgl3ApplicationConfiguration10.setResizable(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((-201169.0f), 0.0f, (float) (-49167));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3100401) + "'", int3 == (-3100401));
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(15601920);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color12 = color4.lerp((float) 1, (-1.6974137E38f), (float) 9, 0.19607843f, (float) (-255));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color17 = color15.set(color16);
        float float18 = color16.b;
        float float19 = color16.r;
        com.badlogic.gdx.graphics.Color color24 = color16.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color26 = color12.mul(color16);
        float float27 = color16.r;
        com.badlogic.gdx.graphics.Color color29 = color16.mul(0.016916571f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
// flaky:         org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(color29);
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        int int10 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 2106077;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.samples = (-1);
        lwjgl3ApplicationConfiguration13.setgles30ContextMajorVersion(1677696502);
        boolean boolean20 = lwjgl3ApplicationConfiguration13.getwindowDecorated();
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration23.disableAudio = true;
        int int28 = lwjgl3ApplicationConfiguration23.windowY;
        int int29 = lwjgl3ApplicationConfiguration23.audioDeviceBufferCount;
        int int30 = lwjgl3ApplicationConfiguration23.a;
        boolean boolean31 = lwjgl3ApplicationConfiguration23.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.hdpiMode = hdpiMode32;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = (-14911125);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.a = 5431006;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration38);
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-4828), (float) (-2336));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-590560) + "'", int2 == (-590560));
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.37438953E11f), (-1.6946629E38f), (-1.7014092E38f), (float) (-130560));
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowWidth = (-1241350299);
        int int13 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int15 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba8888ToColor(color0, (-62496));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-2130837248), (-1.4957742E38f), (float) (-69), (float) (-16896));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16560) + "'", int4 == (-16560));
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color14 = color8.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str16 = color15.toString();
        com.badlogic.gdx.graphics.Color color18 = color8.lerp(color15, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 16);
        com.badlogic.gdx.graphics.Color color22 = color18.sub(color19);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, 1677696502);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color19, 480);
        com.badlogic.gdx.graphics.Color color27 = color0.add(color19);
        float float28 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color33 = color19.set(0.7137255f, (float) 1677696502, 0.39215687f, (float) (-15667200));
        int int34 = com.badlogic.gdx.graphics.Color.rgb888(color33);
        org.junit.Assert.assertNotNull(color0);
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00ff0000" + "'", str16, "00ff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 2.1862947E-38f + "'", float28 == 2.1862947E-38f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11992932 + "'", int34 == 11992932);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 31334400, (float) 12, (-1.7011782E38f), (float) (-22));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color4, (-7672));
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) 16777007, 2.000608f, (float) 10257828, (float) (-1048819));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16) + "'", int4 == (-16));
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) 1044480, (-1.6996239E38f), (float) (-1895829248), (float) 63518);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-250705470) + "'", int4 == (-250705470));
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 247, 0.0f, (float) (-2005368832), (float) (-16777472));
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1620988928));
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration9.windowHeight;
        lwjgl3ApplicationConfiguration9.setdepth((-393464));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.useVsync(false);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration13.initialBackgroundColor = color18;
        lwjgl3ApplicationConfiguration13.setDecorated(false);
        lwjgl3ApplicationConfiguration13.setaudioDeviceBufferSize((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str26 = lwjgl3ApplicationConfiguration25.title;
        lwjgl3ApplicationConfiguration25.a = (-1);
        boolean boolean29 = lwjgl3ApplicationConfiguration25.vSyncEnabled;
        int int30 = lwjgl3ApplicationConfiguration25.windowHeight;
        lwjgl3ApplicationConfiguration25.setuseGL30(false);
        lwjgl3ApplicationConfiguration25.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration25.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration25.gles30ContextMajorVersion = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration24.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration9.hdpiMode = hdpiMode40;
        lwjgl3ApplicationConfiguration9.windowResizable = true;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 480 + "'", int30 == 480);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.b = '4';
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setDecorated(false);
        lwjgl3ApplicationConfiguration15.a = (byte) 10;
        boolean boolean20 = lwjgl3ApplicationConfiguration15.initialVisible;
        int int21 = lwjgl3ApplicationConfiguration15.b;
        lwjgl3ApplicationConfiguration15.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color24 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration15.initialBackgroundColor = color24;
        boolean boolean26 = lwjgl3ApplicationConfiguration15.useGL30;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.stencil = 97;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener33;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-4312048), (-4.731522E-22f), (float) (-1877082112), (-8.2135646E37f));
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) 15687677, 1.0f, (float) (-579592), 0.0f);
        color9.r = (-32);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        color8.b = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color19 = color8.set(color18);
        color19.g = 3.4084816E-37f;
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color27 = color22.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color22);
        int int29 = com.badlogic.gdx.graphics.Color.argb8888(color22);
        color22.g = 1671296512;
        com.badlogic.gdx.graphics.Color color36 = color22.sub((-0.0f), (float) (-567943452), (float) (short) 10, (float) 2);
        float float37 = color36.b;
        com.badlogic.gdx.graphics.Color color38 = color19.add(color36);
        int int39 = com.badlogic.gdx.graphics.Color.rgb888(color36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16777215 + "'", int29 == 16777215);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16776960 + "'", int39 == 16776960);
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.g = 6356992;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int14 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        lwjgl3ApplicationConfiguration0.depth = (-383778816);
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(fileType19);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(61450, (-1562574848));
        lwjgl3ApplicationConfiguration0.windowWidth = 1677786624;
        lwjgl3ApplicationConfiguration0.a = 284196832;
        lwjgl3ApplicationConfiguration0.windowWidth = (-587202461);
        lwjgl3ApplicationConfiguration0.depth = (-579592);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-62527), 1664640000);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        lwjgl3ApplicationConfiguration24.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setDecorated(false);
        lwjgl3ApplicationConfiguration33.a = (byte) 10;
        int int38 = lwjgl3ApplicationConfiguration33.getdepth();
        lwjgl3ApplicationConfiguration33.setdepth(100);
        lwjgl3ApplicationConfiguration33.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        java.lang.String str44 = lwjgl3ApplicationConfiguration33.preferencesDirectory;
        lwjgl3ApplicationConfiguration33.setdisableAudio(false);
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration33.preferencesFileType;
        lwjgl3ApplicationConfiguration31.setpreferencesFileType(fileType47);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType47);
        lwjgl3ApplicationConfiguration0.setwindowHeight(547143616);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 16 + "'", int38 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ".prefs/" + "'", str44, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(65296);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "0df1000e";
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (byte) 1, 0.0f, (float) (byte) 0, (float) (byte) 100);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, (int) (byte) 10);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1442840576) + "'", int9 == (-1442840576));
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-469852380);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str20 = lwjgl3ApplicationConfiguration19.title;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color21, 16);
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color29 = color21.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        color29.r = (-1241513983);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration32.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration32.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration32.r = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration32);
        boolean boolean48 = color29.equals((java.lang.Object) lwjgl3ApplicationConfiguration47);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 5147940, (-68935680));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(16744272, (-579592), (-56320), (-536969804), 33489151, 4080, (-222));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration62);
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        int int14 = lwjgl3ApplicationConfiguration0.a;
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int18 = lwjgl3ApplicationConfiguration0.b;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 183258879, (-2176), (-1677719560), 6946821, 1593541, 99);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.a = 0;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color13 = color10.set(35);
        com.badlogic.gdx.graphics.Color color14 = color10.premultiplyAlpha();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color14;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00ffff00";
        lwjgl3ApplicationConfiguration0.setwindowWidth((-2147483648));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 16776961, (-14513374));
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int19 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int20 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 640 + "'", int20 == 640);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-524536));
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = 65295;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.Files.FileType fileType19 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration0.title = "ffff00b2";
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-232), 16711935, 65025, (-567943452), 33554176, 4030, 1799159552);
        int int31 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + fileType19 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType19.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertNull(lwjgl3DisplayMode9);
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 536871167, (-1203353863));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color20 = color15.sub((float) (short) 0, (-1.6947917E38f), (-1.6947917E38f), (float) (-62986));
        float float21 = color15.toFloatBits();
        com.badlogic.gdx.graphics.Color color22 = color15.cpy();
        com.badlogic.gdx.graphics.Color color24 = color15.set((-2023680));
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(0.19607843f, 9.1477E-41f, (float) 512, (float) 20188);
        int int30 = color29.toIntBits();
        float float31 = color29.r;
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color29, 16710672);
        com.badlogic.gdx.graphics.Color color35 = color29.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color37 = color15.lerp(color29, (float) 65530);
        int int38 = com.badlogic.gdx.graphics.Color.rgba4444(color37);
        float float39 = color37.a;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.7013859E38f) + "'", float21 == (-1.7013859E38f));
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-65486) + "'", int30 == (-65486));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.19607843f + "'", float31 == 0.19607843f);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3855 + "'", int38 == 3855);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color7 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color8);
        com.badlogic.gdx.graphics.Color color14 = color8.mul(0.06666667f, (float) (-58475), (float) (-16734721), (float) 1044480);
        color8.b = (-1.7013859E38f);
        com.badlogic.gdx.graphics.Color color17 = color8.clamp();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color22.r = 63519;
        com.badlogic.gdx.graphics.Color color26 = color22.set(512);
        com.badlogic.gdx.graphics.Color color31 = color26.add((float) (-7876885), (float) 4095, (float) (-512), (-6.9082207E37f));
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color(color31);
        com.badlogic.gdx.graphics.Color color33 = color17.add(color32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str3 = color2.toString();
        com.badlogic.gdx.graphics.Color color5 = color2.set((-62986));
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str7 = color6.toString();
        com.badlogic.gdx.graphics.Color color9 = color6.set((-62986));
        com.badlogic.gdx.graphics.Color color10 = color5.sub(color9);
        com.badlogic.gdx.graphics.Color color11 = color0.add(color9);
        float float12 = color9.a;
        int int13 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color18 = color9.mul(7.34684E-40f, (float) (-3600), (float) 3581985, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = color9.lerp((-6.490371E32f), 0.0f, (float) 536868828, 0.0f, (-4.7187594E37f));
        color24.a = 650250;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000" + "'", str3, "00000000");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ffff09f6" + "'", str7, "ffff09f6");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color7 = color2.add((-5.76451956E17f), 2.87E-42f, 0.44444445f, 5.0192666E30f);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color2);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color2, 0);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color2);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.stencil = 0;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.b = (-48);
        int int18 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setWindowedMode(983023, (-1291845888));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1478492160), (-6.9082207E37f), 0.0f, 0.016916571f);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color4, (-1441792));
        com.badlogic.gdx.graphics.Color color11 = color4.add((float) 570294272, (float) (-236257520), (float) (-16896512), (float) (-1610678528));
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color12 = color7.lerp(color10, (float) (short) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(6529016);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-471488), (-1056));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62527), (-1880421376), (-13513103), 2048, (-858993545), (-587202461), 16750083);
        boolean boolean30 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setwindowY((-1130590));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration5.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration5.samples = (-1);
        lwjgl3ApplicationConfiguration5.useGL30 = true;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ffff72ff");
        int int14 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration5.windowY = 20188;
        int int17 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        int int20 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 32;
        int int23 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00000011";
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-65400);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 16772608, (-16842496));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.samples = '4';
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.windowY = 52;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color35 = color28.sub(color34);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color28, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color38 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color43 = color28.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        com.badlogic.gdx.graphics.Color color45 = color43.mul((-4.581683E37f));
        com.badlogic.gdx.graphics.Color color50 = color45.set((-6.1430064E37f), (-1.5086478E38f), 0.0f, (-5.966859E29f));
        lwjgl3ApplicationConfiguration25.setInitialBackgroundColor(color50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.a = (byte) 10;
        boolean boolean25 = lwjgl3ApplicationConfiguration20.initialVisible;
        int int26 = lwjgl3ApplicationConfiguration20.b;
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration20.initialBackgroundColor = color29;
        com.badlogic.gdx.graphics.Color color31 = color29.cpy();
        color29.a = (-65025);
        float float34 = color29.r;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        int int36 = com.badlogic.gdx.graphics.Color.rgb888(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration37.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration37.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration37.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.Files.FileType fileType45 = lwjgl3ApplicationConfiguration37.preferencesFileType;
        int int46 = lwjgl3ApplicationConfiguration37.samples;
        int int47 = lwjgl3ApplicationConfiguration37.windowHeight;
        lwjgl3ApplicationConfiguration37.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color52 = lwjgl3ApplicationConfiguration37.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color52, 43268);
        int int55 = com.badlogic.gdx.graphics.Color.rgb888(color52);
        com.badlogic.gdx.graphics.Color color56 = new com.badlogic.gdx.graphics.Color(color52);
        float float57 = color52.a;
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color(color52);
        float float59 = color52.a;
        com.badlogic.gdx.graphics.Color color60 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color61 = color52.clamp();
        com.badlogic.gdx.graphics.Color color62 = color29.sub(color61);
        com.badlogic.gdx.graphics.Color color67 = color29.sub((float) (-851456), (float) 234881024, (float) 16519665, (float) (-917519));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color31);
// flaky:         org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16711680 + "'", int36 == 16711680);
        org.junit.Assert.assertNull(fileType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 480 + "'", int47 == 480);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11280416 + "'", int55 == 11280416);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(color67);
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration8.setDecorated(false);
        lwjgl3ApplicationConfiguration8.a = (byte) 10;
        boolean boolean13 = lwjgl3ApplicationConfiguration8.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration8.b;
        lwjgl3ApplicationConfiguration8.setInitialVisible(true);
        lwjgl3ApplicationConfiguration8.windowResizable = false;
        java.lang.String str19 = lwjgl3ApplicationConfiguration8.preferencesDirectory;
        lwjgl3ApplicationConfiguration8.windowHeight = (-8192);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int23 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferSize();
        int int24 = lwjgl3ApplicationConfiguration22.b;
        lwjgl3ApplicationConfiguration22.a = 8;
        lwjgl3ApplicationConfiguration22.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = lwjgl3ApplicationConfiguration22.hdpiMode;
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode29;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode29 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode29.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        int int17 = lwjgl3ApplicationConfiguration13.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20188 + "'", int17 == 20188);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-22));
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int12 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean4 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setsamples((-1714481152));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color0);
        int int8 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color9 = color0.cpy();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(color10);
        float float12 = color10.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16777215 + "'", int8 == 16777215);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1828912896), (float) (-25088), (float) 132007936, (float) (-49167));
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        int int4 = color1.toIntBits();
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color6 = color1.cpy();
        java.lang.Class<?> wildcardClass7 = color1.getClass();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16252928) + "'", int4 == (-16252928));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        int int8 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        com.badlogic.gdx.graphics.Color color11 = color7.set(3);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color12, (-1661466122));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("", fileType21);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        int int24 = lwjgl3ApplicationConfiguration15.samples;
        int int25 = lwjgl3ApplicationConfiguration15.windowHeight;
        lwjgl3ApplicationConfiguration15.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color30 = lwjgl3ApplicationConfiguration15.initialBackgroundColor;
        lwjgl3ApplicationConfiguration15.setDecorated(false);
        boolean boolean33 = lwjgl3ApplicationConfiguration15.windowDecorated;
        boolean boolean34 = lwjgl3ApplicationConfiguration15.windowResizable;
        boolean boolean35 = color12.equals((java.lang.Object) lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode36 = null;
        lwjgl3ApplicationConfiguration15.fullscreenMode = lwjgl3DisplayMode36;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16777215 + "'", int8 == 16777215);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16777215 + "'", int9 == 16777215);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(fileType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setsamples(20160);
        lwjgl3ApplicationConfiguration0.stencil = 10;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.windowWidth = 16772625;
        lwjgl3ApplicationConfiguration0.samples = 33488896;
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 8;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowHeight = 100;
        int int13 = lwjgl3ApplicationConfiguration0.a;
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.title;
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffffff10";
        lwjgl3ApplicationConfiguration0.title = "ffffe000";
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        java.lang.String str2 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration4.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration4.samples = '4';
        int int9 = lwjgl3ApplicationConfiguration4.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType14 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration4.preferencesFileType = fileType14;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration4.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff72ff", fileType17);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "9c810000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".prefs/" + "'", str2, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-262646));
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferCount();
        boolean boolean12 = lwjgl3ApplicationConfiguration10.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-201326593);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-8672));
        lwjgl3ApplicationConfiguration0.setsamples((-379904));
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int16 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-16252928));
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.graphics.Color color13 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color26 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color26, 16);
        com.badlogic.gdx.graphics.Color color29 = color25.sub(color26);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color26, 1677696502);
        float float32 = color26.a;
        com.badlogic.gdx.graphics.Color color33 = color13.sub(color26);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color(color26);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00000000" + "'", str23, "00000000");
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-134351107), (float) (-304320), (float) (-40910), (float) (-154));
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-68848), (float) (-541699));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-136515328) + "'", int2 == (-136515328));
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(184504044, 2040, (-563347472), (-28458960));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.7013838E38f) + "'", float4 == (-1.7013838E38f));
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration14.windowX = 100;
        int int19 = lwjgl3ApplicationConfiguration14.g;
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration14.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffff00", fileType20);
        lwjgl3ApplicationConfiguration0.g = (-270598144);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.windowX = 6147990;
        lwjgl3ApplicationConfiguration0.title = "ffff0080";
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        java.lang.Object obj5 = null;
        boolean boolean6 = color4.equals(obj5);
        int int7 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color8, 20942);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65535 + "'", int7 == 65535);
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-150936577), 0);
        int int20 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int22 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        boolean boolean23 = lwjgl3ApplicationConfiguration21.windowResizable;
        lwjgl3ApplicationConfiguration21.depth = (short) 10;
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, 0, 0);
        int int30 = lwjgl3ApplicationConfiguration21.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration31.samples = '4';
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration31.preferencesFileType;
        lwjgl3ApplicationConfiguration21.preferencesFileType = fileType36;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType36;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65295);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-335), (-14492160));
        int int13 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-68935680);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration16.getpreferencesFileType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + fileType17 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType17.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        lwjgl3ApplicationConfiguration3.disableAudio(false);
        lwjgl3ApplicationConfiguration3.windowX = (-524869);
        int int13 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration3.samples = 16743932;
        boolean boolean16 = lwjgl3ApplicationConfiguration3.getvSyncEnabled();
        int int17 = lwjgl3ApplicationConfiguration3.windowX;
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration3.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration3.windowY = 50134532;
        int int22 = lwjgl3ApplicationConfiguration3.getgles30ContextMajorVersion();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-524869) + "'", int17 == (-524869));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration5.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration5.samples = (-1);
        lwjgl3ApplicationConfiguration5.useGL30 = true;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ffff72ff");
        int int14 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration5.windowY = 20188;
        int int17 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration20.windowResizable = false;
        int int23 = lwjgl3ApplicationConfiguration20.getdepth();
        int int24 = lwjgl3ApplicationConfiguration20.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration20.g = (-68060);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration20);
        lwjgl3ApplicationConfiguration27.setResizable(true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 512 + "'", int24 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-33488131));
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.graphics.Color color16 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setpreferencesDirectory("ffff09f6");
        lwjgl3ApplicationConfiguration7.windowResizable = false;
        lwjgl3ApplicationConfiguration7.setwindowResizable(true);
        int int14 = lwjgl3ApplicationConfiguration7.getwindowHeight();
        lwjgl3ApplicationConfiguration7.preferencesDirectory = "hi!";
        int int17 = lwjgl3ApplicationConfiguration7.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration7.fullscreenMode;
        boolean boolean19 = lwjgl3ApplicationConfiguration7.getvSyncEnabled();
        int int20 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 640 + "'", int17 == 640);
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        color4.g = 167247232;
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        int int8 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        float float9 = color4.b;
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color15 = color10.set((float) (-97920000), (-1.61126566E9f), (float) (-2147483472), (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-256) + "'", int8 == (-256));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.setwindowY((int) ' ');
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int8 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration9.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration9.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration9.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration9.setwindowHeight(151015132);
        lwjgl3ApplicationConfiguration9.initialVisible = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.samples = (-6422785);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount((-65486));
        int int15 = lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration10.setsamples(178);
        lwjgl3ApplicationConfiguration10.audioDeviceSimultaneousSources = (-284225280);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration7.preferencesFileType;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 3855;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-65486));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration0.hdpiMode;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = color13.sub(color19);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color23 = color22.cpy();
        com.badlogic.gdx.graphics.Color color28 = color22.add((float) '#', (float) (-13500161), (float) 512, (float) (-335));
        java.lang.String str29 = color28.toString();
        com.badlogic.gdx.graphics.Color color30 = color19.add(color28);
        com.badlogic.gdx.graphics.Color color32 = color19.mul(0.13725491f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ff00ff00" + "'", str29, "ff00ff00");
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowY = (-18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = color32.mul(color40);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color43 = color26.set(color42);
        com.badlogic.gdx.graphics.Color color48 = color43.set((float) (-2550), 6.466791E-24f, 0.99215686f, (-4.581683E37f));
        com.badlogic.gdx.graphics.Color color50 = color48.mul((float) (-69392));
        com.badlogic.gdx.graphics.Color color51 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color color52 = new com.badlogic.gdx.graphics.Color(color51);
        com.badlogic.gdx.graphics.Color color53 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color58 = color52.add((float) 786, (float) (-16734721), (float) 1677721600, (float) (-78));
        com.badlogic.gdx.graphics.Color color59 = new com.badlogic.gdx.graphics.Color(color52);
        com.badlogic.gdx.graphics.Color color61 = color50.lerp(color52, (float) (-264192));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color61);
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-84), (float) (-233901810), (float) (-1425), (float) (-232));
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        int int10 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16776959);
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.b = 1677786624;
        lwjgl3ApplicationConfiguration0.setTitle("ffff0100");
        int int9 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color25 = color9.sub(color24);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color25, (-9216));
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((float) (-90432), (float) (-1311232), (float) (-10158080), (float) (-65024));
        com.badlogic.gdx.graphics.Color color34 = color25.lerp(color32, 0.0f);
        com.badlogic.gdx.graphics.Color color35 = new com.badlogic.gdx.graphics.Color(color34);
        com.badlogic.gdx.graphics.Color color40 = color35.set((float) 537395200, 0.0f, 4.0487513E-19f, (float) (-16711698));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1140916480));
        int int2 = com.badlogic.gdx.graphics.Color.rgb565(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47071 + "'", int2 == 47071);
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.setwindowY((int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType14);
        int int16 = lwjgl3ApplicationConfiguration8.r;
        int int17 = lwjgl3ApplicationConfiguration8.getwindowY();
        lwjgl3ApplicationConfiguration8.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode22);
        com.badlogic.gdx.Files.FileType fileType24 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration21.setpreferencesFileType(fileType24);
        lwjgl3ApplicationConfiguration21.setwindowY(100);
        lwjgl3ApplicationConfiguration21.r = 0;
        lwjgl3ApplicationConfiguration21.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration32.disableAudio = true;
        lwjgl3ApplicationConfiguration32.initialVisible = true;
        int int39 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration32.b = (-62986);
        lwjgl3ApplicationConfiguration32.b = 2;
        lwjgl3ApplicationConfiguration32.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration32.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration32.g = 65295;
        boolean boolean50 = lwjgl3ApplicationConfiguration32.initialVisible;
        com.badlogic.gdx.Files.FileType fileType51 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration21.preferencesFileType = fileType51;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("00000000", fileType51);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 4517580, (-48037919));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + fileType51 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType51.equals(com.badlogic.gdx.Files.FileType.Local));
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 16711935;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        int int23 = lwjgl3ApplicationConfiguration18.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode24 = lwjgl3ApplicationConfiguration18.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration26.windowX = 100;
        int int31 = lwjgl3ApplicationConfiguration26.g;
        com.badlogic.gdx.Files.FileType fileType32 = lwjgl3ApplicationConfiguration26.preferencesFileType;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("4169e1ff", fileType32);
        boolean boolean34 = lwjgl3ApplicationConfiguration18.initialVisible;
        int int35 = lwjgl3ApplicationConfiguration18.depth;
        lwjgl3ApplicationConfiguration18.setwindowHeight(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration38.setpreferencesFileType(fileType39);
        lwjgl3ApplicationConfiguration38.disableAudio = true;
        int int43 = lwjgl3ApplicationConfiguration38.windowY;
        int int44 = lwjgl3ApplicationConfiguration38.audioDeviceBufferCount;
        int int45 = lwjgl3ApplicationConfiguration38.a;
        boolean boolean46 = lwjgl3ApplicationConfiguration38.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration38.hdpiMode = hdpiMode47;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode47;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration51.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration51.windowX = 100;
        int int56 = lwjgl3ApplicationConfiguration51.g;
        com.badlogic.gdx.Files.FileType fileType57 = lwjgl3ApplicationConfiguration51.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType62 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("hi!", fileType62);
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType62);
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("8ff00000", fileType62);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType62);
        int int67 = lwjgl3ApplicationConfiguration0.r;
        java.lang.String str68 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
        org.junit.Assert.assertTrue("'" + fileType32 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType32.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 16 + "'", int35 == 16);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 8 + "'", int56 == 8);
        org.junit.Assert.assertTrue("'" + fileType57 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType57.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType62 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType62.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffbdfbb0";
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("8feffe10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1));
        lwjgl3ApplicationConfiguration0.r = 16776960;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration15.samples = (-1);
        lwjgl3ApplicationConfiguration15.useGL30 = true;
        lwjgl3ApplicationConfiguration15.setpreferencesDirectory("ffff72ff");
        int int24 = lwjgl3ApplicationConfiguration15.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration15.windowX = 512;
        boolean boolean27 = lwjgl3ApplicationConfiguration15.vSyncEnabled;
        lwjgl3ApplicationConfiguration15.stencil = (-1306385665);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = lwjgl3ApplicationConfiguration15.windowListener;
        java.lang.String str31 = lwjgl3ApplicationConfiguration15.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        lwjgl3ApplicationConfiguration33.initialVisible = true;
        int int40 = lwjgl3ApplicationConfiguration33.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration33.b = (-62986);
        lwjgl3ApplicationConfiguration33.b = 2;
        lwjgl3ApplicationConfiguration33.setwindowX((int) 'a');
        int int47 = lwjgl3ApplicationConfiguration33.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration49.setpreferencesFileType(fileType50);
        lwjgl3ApplicationConfiguration49.useVsync(false);
        lwjgl3ApplicationConfiguration49.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration49.a = (-62986);
        lwjgl3ApplicationConfiguration49.setdisableAudio(true);
        boolean boolean61 = lwjgl3ApplicationConfiguration49.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration63.setFullscreenMode(displayMode64);
        lwjgl3ApplicationConfiguration63.windowX = 100;
        int int68 = lwjgl3ApplicationConfiguration63.g;
        com.badlogic.gdx.Files.FileType fileType69 = lwjgl3ApplicationConfiguration63.getpreferencesFileType();
        lwjgl3ApplicationConfiguration49.setPreferencesConfig("ffffff00", fileType69);
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("000000ff", fileType69);
        boolean boolean72 = lwjgl3ApplicationConfiguration33.windowResizable;
        lwjgl3ApplicationConfiguration33.setDecorated(true);
        boolean boolean75 = lwjgl3ApplicationConfiguration33.getdisableAudio();
        lwjgl3ApplicationConfiguration33.setuseGL30(true);
        com.badlogic.gdx.Files.FileType fileType78 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("ffffe6ff", fileType78);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffffff", fileType78);
        com.badlogic.gdx.Files.FileType fileType81 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean82 = lwjgl3ApplicationConfiguration0.initialVisible;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ffff72ff" + "'", str31, "ffff72ff");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertTrue("'" + fileType69 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType69.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + fileType78 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType78.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType81 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType81.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.title = "";
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        int int17 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.windowWidth = 6356992;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int16 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        color4.r = 31;
        com.badlogic.gdx.graphics.Color color16 = color4.add((float) 63519, (-1.6789801E38f), (-1.6950243E38f), (float) 1671296512);
        com.badlogic.gdx.graphics.Color color18 = color16.mul(0.7137255f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color18, 1882);
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(3582);
        com.badlogic.gdx.graphics.Color color23 = color18.add(color22);
        int int24 = com.badlogic.gdx.graphics.Color.rgba4444(color22);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        int int11 = lwjgl3ApplicationConfiguration8.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration8.getpreferencesFileType();
        lwjgl3ApplicationConfiguration8.setwindowResizable(false);
        lwjgl3ApplicationConfiguration8.disableAudio(false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(fileType12);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = lwjgl3ApplicationConfiguration3.fullscreenMode;
        lwjgl3ApplicationConfiguration3.disableAudio(false);
        lwjgl3ApplicationConfiguration3.windowX = (-524869);
        int int13 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration3.samples = 16743932;
        lwjgl3ApplicationConfiguration3.setaudioDeviceBufferSize(1);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.g;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1902614));
        boolean boolean14 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-255);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener10;
        int int12 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        int int2 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-22));
        int int5 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(0);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff3322";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode11 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode11.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.b = 100;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        int int15 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.samples = (-1);
        lwjgl3ApplicationConfiguration10.useGL30 = true;
        lwjgl3ApplicationConfiguration10.setpreferencesDirectory("ffff72ff");
        int int19 = lwjgl3ApplicationConfiguration10.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration10.windowX = 512;
        boolean boolean22 = lwjgl3ApplicationConfiguration10.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int25 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferSize();
        boolean boolean26 = lwjgl3ApplicationConfiguration24.windowResizable;
        lwjgl3ApplicationConfiguration24.disableAudio = false;
        lwjgl3ApplicationConfiguration24.setResizable(true);
        lwjgl3ApplicationConfiguration24.setwindowX(10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = lwjgl3ApplicationConfiguration24.windowListener;
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration24.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.setPreferencesConfig("ffff0100", fileType34);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration0.setwindowY((-5001));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener33);
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21605");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(12524384);
    }

    @Test
    public void test21606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21606");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.44115188E17f), 0.0f, (float) (-84), (float) (-63616));
    }

    @Test
    public void test21607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21607");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color1);
        float float7 = color1.g;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test21608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.samples = (-232);
        lwjgl3ApplicationConfiguration0.windowX = (-183869281);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test21609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21609");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-56610));
        int int2 = com.badlogic.gdx.graphics.Color.rgba4444(color1);
        color1.r = 120;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65325 + "'", int2 == 65325);
    }

    @Test
    public void test21610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.a = 8;
        int int15 = lwjgl3ApplicationConfiguration10.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20188 + "'", int15 == 20188);
    }

    @Test
    public void test21611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setsamples(1671296512);
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int16 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowWidth((-79360));
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-2147283968);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (-16318464), (-852720), 1051918336, (-4849409), (-157), (-2350080));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test21612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.BLACK;
        float float7 = color6.r;
        com.badlogic.gdx.graphics.Color color12 = color6.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color6;
        com.badlogic.gdx.graphics.Color color14 = color6.cpy();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) (-7680), (float) (-1945138), (float) (-37648), (float) (-8520704), (float) (-16777038));
        com.badlogic.gdx.graphics.Color color23 = color15.set((-3584));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.06451613f + "'", float7 == 0.06451613f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test21613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        java.lang.String str11 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.windowHeight = (-8192);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int15 = lwjgl3ApplicationConfiguration14.getaudioDeviceBufferSize();
        int int16 = lwjgl3ApplicationConfiguration14.b;
        lwjgl3ApplicationConfiguration14.a = 8;
        lwjgl3ApplicationConfiguration14.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = lwjgl3ApplicationConfiguration14.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.windowHeight = (-65438);
        lwjgl3ApplicationConfiguration0.setwindowWidth(1086324586);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".prefs/" + "'", str11, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources = 1557110528;
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (-53504), (-1308557313));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("", fileType28);
        int int30 = lwjgl3ApplicationConfiguration22.r;
        int int31 = lwjgl3ApplicationConfiguration22.getwindowY();
        lwjgl3ApplicationConfiguration22.setTitle(".prefs/");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration35.setFullscreenMode(displayMode36);
        com.badlogic.gdx.Files.FileType fileType38 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration35.setpreferencesFileType(fileType38);
        lwjgl3ApplicationConfiguration35.setwindowY(100);
        lwjgl3ApplicationConfiguration35.r = 0;
        lwjgl3ApplicationConfiguration35.setsamples(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType47 = null;
        lwjgl3ApplicationConfiguration46.setpreferencesFileType(fileType47);
        lwjgl3ApplicationConfiguration46.disableAudio = true;
        lwjgl3ApplicationConfiguration46.initialVisible = true;
        int int53 = lwjgl3ApplicationConfiguration46.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration46.b = (-62986);
        lwjgl3ApplicationConfiguration46.b = 2;
        lwjgl3ApplicationConfiguration46.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration46.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration46.g = 65295;
        boolean boolean64 = lwjgl3ApplicationConfiguration46.initialVisible;
        com.badlogic.gdx.Files.FileType fileType65 = com.badlogic.gdx.Files.FileType.Local;
        lwjgl3ApplicationConfiguration46.setpreferencesFileType(fileType65);
        lwjgl3ApplicationConfiguration35.preferencesFileType = fileType65;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("00000000", fileType65);
        lwjgl3ApplicationConfiguration22.depth = (-379904);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = lwjgl3ApplicationConfiguration22.hdpiMode;
        lwjgl3ApplicationConfiguration15.hdpiMode = hdpiMode71;
        lwjgl3ApplicationConfiguration15.useVsync(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 512 + "'", int53 == 512);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + fileType65 + "' != '" + com.badlogic.gdx.Files.FileType.Local + "'", fileType65.equals(com.badlogic.gdx.Files.FileType.Local));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration14.samples = 6307425;
        int int17 = lwjgl3ApplicationConfiguration14.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test21616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int16 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int17 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test21617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("", fileType18);
        lwjgl3ApplicationConfiguration12.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration12.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration12.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration12);
        lwjgl3ApplicationConfiguration27.g = 43268;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration30.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration30.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType43 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration30.setpreferencesFileType(fileType43);
        lwjgl3ApplicationConfiguration27.preferencesFileType = fileType43;
        lwjgl3ApplicationConfiguration27.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration48.windowX = 100;
        int int53 = lwjgl3ApplicationConfiguration48.stencil;
        int int54 = lwjgl3ApplicationConfiguration48.windowY;
        lwjgl3ApplicationConfiguration48.a = 43268;
        int int57 = lwjgl3ApplicationConfiguration48.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration48.setdepth(512);
        lwjgl3ApplicationConfiguration48.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration62.setpreferencesFileType(fileType63);
        lwjgl3ApplicationConfiguration62.useVsync(false);
        lwjgl3ApplicationConfiguration62.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration62.a = (-62986);
        lwjgl3ApplicationConfiguration62.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration62.hdpiMode = hdpiMode74;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = lwjgl3ApplicationConfiguration27.hdpiMode;
        lwjgl3ApplicationConfiguration11.hdpiMode = hdpiMode78;
        lwjgl3ApplicationConfiguration11.windowWidth = (-254);
        int int82 = lwjgl3ApplicationConfiguration11.stencil;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration27);
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test21618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.depth = (-254);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-16711680), (-128512));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test21619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = lwjgl3ApplicationConfiguration0.hdpiMode;
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-2097212928));
        lwjgl3ApplicationConfiguration0.setWindowPosition((-537010176), (-17425764));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
    }

    @Test
    public void test21620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21620");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1671296512);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        float float3 = color1.g;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, (-13260));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.6156863f + "'", float3 == 0.6156863f);
    }

    @Test
    public void test21621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-232));
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setwindowHeight((-1291891232));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test21622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21622");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(167247232);
        com.badlogic.gdx.graphics.Color color7 = color1.lerp((float) 31334400, (float) 3845, (float) (-62986), (float) (-16741598), (float) (-379904));
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color7);
        com.badlogic.gdx.graphics.Color color10 = color7.mul((float) (-652800));
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((-4.253659E37f), (-4.2865007E37f), (-1.7013372E38f), 0.0f);
        com.badlogic.gdx.graphics.Color color16 = color10.add(color15);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test21623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1611265692);
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-2105704448);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener9;
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test21624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(65040);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1175296);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test21625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.GREEN;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.b = (-10);
        lwjgl3ApplicationConfiguration0.windowY = (-32);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 16776974;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test21626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowHeight = (-2117940064);
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration20.setgles30ContextMinorVersion(1557110528);
        lwjgl3ApplicationConfiguration20.setuseGL30(true);
        boolean boolean25 = lwjgl3ApplicationConfiguration20.getwindowDecorated();
        int int26 = lwjgl3ApplicationConfiguration20.getwindowX();
        lwjgl3ApplicationConfiguration20.windowDecorated = true;
        lwjgl3ApplicationConfiguration20.disableAudio = true;
        lwjgl3ApplicationConfiguration20.setdepth((-16646387));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test21627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.setWindowedMode(512, (int) '#');
        int int23 = lwjgl3ApplicationConfiguration15.stencil;
        int int24 = lwjgl3ApplicationConfiguration15.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration15.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration15.setWindowedMode(16, (-78));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration15.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration33.setFullscreenMode(displayMode34);
        lwjgl3ApplicationConfiguration33.windowX = 100;
        int int38 = lwjgl3ApplicationConfiguration33.g;
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        boolean boolean40 = lwjgl3ApplicationConfiguration33.windowDecorated;
        lwjgl3ApplicationConfiguration33.setwindowX((-1291845633));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration44 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration44.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration44.windowX = 100;
        int int49 = lwjgl3ApplicationConfiguration44.g;
        com.badlogic.gdx.Files.FileType fileType50 = lwjgl3ApplicationConfiguration44.getpreferencesFileType();
        int int51 = lwjgl3ApplicationConfiguration44.b;
        lwjgl3ApplicationConfiguration44.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType54 = lwjgl3ApplicationConfiguration44.preferencesFileType;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("00ff0000", fileType54);
        lwjgl3ApplicationConfiguration32.preferencesFileType = fileType54;
        com.badlogic.gdx.Files.FileType fileType57 = lwjgl3ApplicationConfiguration32.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType57;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        int int61 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 1570376701);
        lwjgl3ApplicationConfiguration0.windowWidth = (-1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + fileType50 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType50.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType57 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType57.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test21628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.setwindowY(100);
        int int7 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-154460160);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test21629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.b = (-40036);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.a = 26163;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".prefs/" + "'", str17, ".prefs/");
    }

    @Test
    public void test21630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21630");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1024), 0.9843137f, (float) (-7905), (float) 45312);
    }

    @Test
    public void test21631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21631");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("ffff00d1");
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test21632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.setdepth(480);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int26 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20188 + "'", int26 == 20188);
    }

    @Test
    public void test21633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21633");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6614816E38f), (-3.9429004E34f), (float) 20942, 0.99215686f);
        java.lang.Class<?> wildcardClass5 = color4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        java.lang.String str18 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.audioDeviceBufferCount = 16;
        lwjgl3ApplicationConfiguration16.setwindowWidth(34303);
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration16.preferencesFileType;
        java.lang.String str24 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.setDecorated(false);
        lwjgl3ApplicationConfiguration16.stencil = (-6095552);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test21635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("00ff0000");
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int13 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.windowX = (-32824);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test21636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        lwjgl3ApplicationConfiguration9.windowHeight = (short) 1;
        int int14 = lwjgl3ApplicationConfiguration9.windowWidth;
        lwjgl3ApplicationConfiguration9.setBackBufferConfig((int) (byte) -1, (-9216), (-33488131), (-537010176), (-167706623), 0, 650250);
        int int23 = lwjgl3ApplicationConfiguration9.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration9.setTitle("ffff00ff");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test21637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21637");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-65538), (float) (-6888705), (float) (-16252928), (float) (-485166560));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-536940544) + "'", int4 == (-536940544));
    }

    @Test
    public void test21638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.a = (-16450560);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setwindowY(318766848);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
    }

    @Test
    public void test21639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(61450, (-1562574848));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-175017984), (-1714481152));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test21640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        int int18 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setwindowX((-59392));
        int int24 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean25 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean26 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test21641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21641");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.WHITE;
        com.badlogic.gdx.graphics.Color color1 = color0.premultiplyAlpha();
        float float2 = color0.a;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(25500);
        com.badlogic.gdx.graphics.Color color5 = color0.set(color4);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        color6.b = (-15944385);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
// flaky:         org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test21642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test21643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        java.lang.String str9 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".prefs/" + "'", str9, ".prefs/");
    }

    @Test
    public void test21644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setsamples(256);
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int16 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType20);
        lwjgl3ApplicationConfiguration19.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration19.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration19.r = (short) 10;
        boolean boolean34 = lwjgl3ApplicationConfiguration19.windowResizable;
        lwjgl3ApplicationConfiguration19.useGL30 = false;
        lwjgl3ApplicationConfiguration19.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.setDecorated(false);
        lwjgl3ApplicationConfiguration39.a = (byte) 10;
        boolean boolean44 = lwjgl3ApplicationConfiguration39.initialVisible;
        int int45 = lwjgl3ApplicationConfiguration39.b;
        lwjgl3ApplicationConfiguration39.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color48 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration39.initialBackgroundColor = color48;
        com.badlogic.gdx.graphics.Color color50 = color48.cpy();
        color48.a = (-65025);
        float float53 = color48.r;
        lwjgl3ApplicationConfiguration19.initialBackgroundColor = color48;
        int int55 = com.badlogic.gdx.graphics.Color.rgb888(color48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration56.setpreferencesFileType(fileType57);
        lwjgl3ApplicationConfiguration56.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration56.setPreferencesConfig("", fileType62);
        com.badlogic.gdx.Files.FileType fileType64 = lwjgl3ApplicationConfiguration56.preferencesFileType;
        int int65 = lwjgl3ApplicationConfiguration56.samples;
        int int66 = lwjgl3ApplicationConfiguration56.windowHeight;
        lwjgl3ApplicationConfiguration56.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color71 = lwjgl3ApplicationConfiguration56.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color71, 43268);
        int int74 = com.badlogic.gdx.graphics.Color.rgb888(color71);
        com.badlogic.gdx.graphics.Color color75 = new com.badlogic.gdx.graphics.Color(color71);
        float float76 = color71.a;
        com.badlogic.gdx.graphics.Color color77 = new com.badlogic.gdx.graphics.Color(color71);
        float float78 = color71.a;
        com.badlogic.gdx.graphics.Color color79 = new com.badlogic.gdx.graphics.Color(color71);
        com.badlogic.gdx.graphics.Color color80 = color71.clamp();
        com.badlogic.gdx.graphics.Color color81 = color48.sub(color80);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color81;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ffff72ff" + "'", str15, "ffff72ff");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 16711935 + "'", int55 == 16711935);
        org.junit.Assert.assertNull(fileType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 480 + "'", int66 == 480);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 11280416 + "'", int74 == 11280416);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.0f + "'", float76 == 0.0f);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test21645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.windowWidth = 120;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test21646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((-2132934656));
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-16775334));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test21647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21647");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color8 = color1.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        int int40 = com.badlogic.gdx.graphics.Color.rgb565(color9);
        com.badlogic.gdx.graphics.Color color45 = color9.mul((float) (byte) 0, (float) (byte) 100, (float) 35, (float) (-255));
        com.badlogic.gdx.graphics.Color color46 = color8.mul(color9);
        com.badlogic.gdx.graphics.Color color51 = color46.mul((float) (-40036), (float) (-222), (float) (-16711680), (float) 1651519680);
        com.badlogic.gdx.graphics.Color color57 = color51.lerp((float) (-1152909312), (float) (-16447240), (float) (-1143197184), (-4.66537E36f), (float) (-15860224));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.67741936f + "'", float3 == 0.67741936f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2047 + "'", int40 == 2047);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color57);
    }

    @Test
    public void test21648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.b = 34277;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 3381300, (-14622977));
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        int int19 = lwjgl3ApplicationConfiguration0.stencil;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test21649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode9 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode9;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
    }

    @Test
    public void test21650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        com.badlogic.gdx.Files.FileType fileType18 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType18);
        lwjgl3ApplicationConfiguration15.b = 6529016;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        int int24 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration25.windowWidth = 15397887;
        int int28 = lwjgl3ApplicationConfiguration25.getwindowHeight();
        int int29 = lwjgl3ApplicationConfiguration25.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration25.setuseGL30(true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test21651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21651");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        float float1 = color0.toFloatBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration2 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str3 = lwjgl3ApplicationConfiguration2.title;
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color4, 16);
        lwjgl3ApplicationConfiguration2.setInitialBackgroundColor(color4);
        com.badlogic.gdx.graphics.Color color12 = color4.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color20 = color14.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str22 = color21.toString();
        com.badlogic.gdx.graphics.Color color24 = color14.lerp(color21, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color25 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color25, 16);
        com.badlogic.gdx.graphics.Color color28 = color24.sub(color25);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color25, 1677696502);
        com.badlogic.gdx.graphics.Color color31 = color4.sub(color25);
        com.badlogic.gdx.graphics.Color color32 = color0.add(color25);
        com.badlogic.gdx.graphics.Color color33 = color25.cpy();
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color35 = color34.cpy();
        int int36 = com.badlogic.gdx.graphics.Color.argb8888(color35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration37 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str38 = lwjgl3ApplicationConfiguration37.title;
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color39, 16);
        lwjgl3ApplicationConfiguration37.setInitialBackgroundColor(color39);
        com.badlogic.gdx.graphics.Color color47 = color39.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color55 = color49.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color56 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str57 = color56.toString();
        com.badlogic.gdx.graphics.Color color59 = color49.lerp(color56, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color60 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color60, 16);
        com.badlogic.gdx.graphics.Color color63 = color59.sub(color60);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color60, 1677696502);
        com.badlogic.gdx.graphics.Color color66 = color39.sub(color60);
        com.badlogic.gdx.graphics.Color color67 = color35.mul(color60);
        int int68 = com.badlogic.gdx.graphics.Color.rgba4444(color60);
        com.badlogic.gdx.graphics.Color color70 = color60.mul((float) 65290);
        com.badlogic.gdx.graphics.Color color72 = color25.lerp(color60, 0.0f);
        com.badlogic.gdx.graphics.Color color73 = new com.badlogic.gdx.graphics.Color(color72);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0387595E-38f + "'", float1 == 2.0387595E-38f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00ff0000" + "'", str22, "00ff0000");
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5374174 + "'", int36 == 5374174);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "00ff0000" + "'", str57, "00ff0000");
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(color72);
    }

    @Test
    public void test21652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test21653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        com.badlogic.gdx.graphics.Color color11 = color9.cpy();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, 983025);
        float float14 = color11.b;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.94509804f + "'", float14 == 0.94509804f);
    }

    @Test
    public void test21654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(16777215);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int15 = lwjgl3ApplicationConfiguration0.getdepth();
        int int16 = lwjgl3ApplicationConfiguration0.b;
        int int17 = lwjgl3ApplicationConfiguration0.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test21655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21655");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("00000000");
        com.badlogic.gdx.graphics.Color color6 = color1.sub(0.9529412f, (float) (-1904640), (float) 64383, (float) (-536674832));
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test21656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21656");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-159989760));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        int int3 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-1644167168);
        int int9 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test21658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 'a';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.b = 100;
        int int15 = lwjgl3ApplicationConfiguration12.windowHeight;
        lwjgl3ApplicationConfiguration12.setBackBufferConfig(178, (-7876885), (-201326593), 284196832, (-187392), (-393464), 0);
        int int24 = lwjgl3ApplicationConfiguration12.g;
        java.lang.String str25 = lwjgl3ApplicationConfiguration12.getpreferencesDirectory();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType27);
        lwjgl3ApplicationConfiguration26.disableAudio = true;
        int int31 = lwjgl3ApplicationConfiguration26.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode32 = lwjgl3ApplicationConfiguration26.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration34.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration34.windowX = 100;
        int int39 = lwjgl3ApplicationConfiguration34.g;
        com.badlogic.gdx.Files.FileType fileType40 = lwjgl3ApplicationConfiguration34.preferencesFileType;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("4169e1ff", fileType40);
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7876885) + "'", int24 == (-7876885));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ".prefs/" + "'", str25, ".prefs/");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + fileType40 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType40.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-10);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration18.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration18.samples = 16514570;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test21660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.windowHeight = (-10);
        lwjgl3ApplicationConfiguration0.windowY = (-524536);
        int int10 = lwjgl3ApplicationConfiguration0.stencil;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test21661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration7.fullscreenMode;
        lwjgl3ApplicationConfiguration7.r = (-240);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((float) (-1611265692), (float) (short) -1, (float) (short) 10, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color18, (-50396672));
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color27 = color25.mul((float) 100);
        com.badlogic.gdx.graphics.Color color32 = color25.add((float) (-1611265692), (float) 6147990, (float) (-1291845633), (float) 63736);
        color25.a = (-1611265692);
        com.badlogic.gdx.graphics.Color color35 = color25.cpy();
        com.badlogic.gdx.graphics.Color color37 = color35.mul((-1.61126566E9f));
        com.badlogic.gdx.graphics.Color color38 = color18.mul(color37);
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color37;
        lwjgl3ApplicationConfiguration7.audioDeviceSimultaneousSources = (-10553861);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test21662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (-524869), 587162524);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color11, (int) 'a');
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color16 = color11.lerp(color14, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str18 = color17.toString();
        com.badlogic.gdx.graphics.Color color19 = color14.sub(color17);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, (-1880097264));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowX(0);
        lwjgl3ApplicationConfiguration0.b = (-301662208);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00ff0000" + "'", str18, "00ff0000");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
    }

    @Test
    public void test21663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color14 = color12.set((int) (short) 0);
        int int15 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        java.lang.String str16 = color12.toString();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color22 = color17.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        com.badlogic.gdx.graphics.Color color28 = color24.set(3);
        com.badlogic.gdx.graphics.Color color29 = color12.set(color28);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        boolean boolean31 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.title = "ffffff22";
        int int35 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int37 = lwjgl3ApplicationConfiguration0.stencil;
        int int38 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16777215 + "'", int25 == 16777215);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16777215 + "'", int26 == 16777215);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test21664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        int int13 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener17;
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "e1ff0000";
        int int22 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65522 + "'", int13 == 65522);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test21665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = (-1306385665);
        lwjgl3ApplicationConfiguration10.setwindowX(652800);
        lwjgl3ApplicationConfiguration10.setaudioDeviceBufferCount((-1303445504));
        lwjgl3ApplicationConfiguration10.setgles30ContextMinorVersion((-134351107));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
    }

    @Test
    public void test21666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        int int5 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int6 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.a = 33423360;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration9.b;
        lwjgl3ApplicationConfiguration9.useGL30 = false;
        lwjgl3ApplicationConfiguration9.setgles30ContextMinorVersion((-262646));
        int int16 = lwjgl3ApplicationConfiguration9.g;
        com.badlogic.gdx.Files.FileType fileType18 = com.badlogic.gdx.Files.FileType.Classpath;
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("00000000", fileType18);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.Classpath));
    }

    @Test
    public void test21667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21667");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits((-1131802), (-2350080), (-1610678528), (-24103296));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1131802) + "'", int4 == (-1131802));
    }

    @Test
    public void test21668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21668");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLD;
        com.badlogic.gdx.graphics.Color color2 = color0.set(570949632);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        com.badlogic.gdx.graphics.Color color8 = color2.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color7);
        com.badlogic.gdx.graphics.Color color14 = color9.sub(0.0f, (float) (-934295308), (float) 8224, (-1.6947916E38f));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color14, (-3966014));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test21669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        int int14 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.windowY = 31;
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(640);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00004edc";
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1902614));
        int int14 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.windowDecorated;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        int int19 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test21671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int7 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test21672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int10 = lwjgl3ApplicationConfiguration9.getaudioDeviceBufferSize();
        int int11 = lwjgl3ApplicationConfiguration9.b;
        lwjgl3ApplicationConfiguration9.useGL30 = false;
        lwjgl3ApplicationConfiguration9.useGL30 = true;
        lwjgl3ApplicationConfiguration9.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration9.setwindowX((-16734721));
        int int20 = lwjgl3ApplicationConfiguration9.getdepth();
        java.lang.String str21 = lwjgl3ApplicationConfiguration9.preferencesDirectory;
        lwjgl3ApplicationConfiguration9.useGL30 = true;
        com.badlogic.gdx.Files.FileType fileType24 = lwjgl3ApplicationConfiguration9.preferencesFileType;
        lwjgl3ApplicationConfiguration9.setwindowX(6180224);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode27;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + fileType8 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType8.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".prefs/" + "'", str21, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType24 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType24.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.setwindowDecorated(false);
        int int15 = lwjgl3ApplicationConfiguration12.getgles30ContextMajorVersion();
        boolean boolean16 = lwjgl3ApplicationConfiguration12.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration18.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration18.windowX = 100;
        int int23 = lwjgl3ApplicationConfiguration18.g;
        int int24 = lwjgl3ApplicationConfiguration18.getwindowY();
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration18.getpreferencesFileType();
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("88bb2222", fileType25);
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((-16646655), (-67611904), 16776994, (-265712), (-1439745), (-18874624), 252960);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration12.preferencesFileType = fileType35;
        int int37 = lwjgl3ApplicationConfiguration12.getdepth();
        int int38 = lwjgl3ApplicationConfiguration12.getwindowWidth();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1439745) + "'", int37 == (-1439745));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 640 + "'", int38 == 640);
    }

    @Test
    public void test21674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        int int8 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration10.setDecorated(false);
        lwjgl3ApplicationConfiguration10.a = (byte) 10;
        boolean boolean15 = lwjgl3ApplicationConfiguration10.initialVisible;
        int int16 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration10.initialBackgroundColor = color19;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int22 = lwjgl3ApplicationConfiguration21.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration21.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration21.preferencesFileType;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration27.windowX = 100;
        int int32 = lwjgl3ApplicationConfiguration27.g;
        int int33 = lwjgl3ApplicationConfiguration27.getwindowY();
        com.badlogic.gdx.Files.FileType fileType34 = lwjgl3ApplicationConfiguration27.getpreferencesFileType();
        lwjgl3ApplicationConfiguration10.preferencesFileType = fileType34;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff00ff", fileType34);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "0000ee00";
        lwjgl3ApplicationConfiguration0.setWindowPosition(6528000, (-14492160));
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((int) 'a');
        int int44 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.setWindowedMode(65504, 0);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 4065;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + fileType34 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType34.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test21675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        java.lang.String str10 = lwjgl3ApplicationConfiguration7.title;
        boolean boolean11 = lwjgl3ApplicationConfiguration7.windowResizable;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((float) (-203427056), (float) 3407872, (float) (-16711936), (float) (-1135083520));
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color16;
        com.badlogic.gdx.graphics.Color color18 = color16.cpy();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test21676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(255);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-65568), (-150), (-141440), 469827583, (-150993664), 61200, (-16780544));
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test21677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21677");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(120, (-1879860224), 12931096, 8925);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.03681E38f) + "'", float4 == (-1.03681E38f));
    }

    @Test
    public void test21678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffffff00");
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (-27133));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(299695904);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test21679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig(7, (-1407090), (-2130706432));
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        boolean boolean25 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test21680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion(65025);
        java.lang.String str19 = lwjgl3ApplicationConfiguration16.preferencesDirectory;
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion((int) (short) 0);
        lwjgl3ApplicationConfiguration16.setwindowResizable(false);
        int int24 = lwjgl3ApplicationConfiguration16.getwindowHeight();
        lwjgl3ApplicationConfiguration16.title = "00000000";
        lwjgl3ApplicationConfiguration16.audioDeviceBufferSize = (-469852380);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion((-1179630));
        com.badlogic.gdx.Files.FileType fileType31 = lwjgl3ApplicationConfiguration16.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".prefs/" + "'", str19, ".prefs/");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 480 + "'", int24 == 480);
        org.junit.Assert.assertTrue("'" + fileType31 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType31.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test21681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test21682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21682");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-14368), (float) (-246));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54538) + "'", int2 == (-54538));
    }

    @Test
    public void test21683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        int int11 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 7576628;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff44ee";
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color((int) ' ');
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color18, 1878880718);
        int int21 = com.badlogic.gdx.graphics.Color.rgb888(color18);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        int int23 = com.badlogic.gdx.graphics.Color.rgb565(color18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 480 + "'", int11 == 480);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7339377 + "'", int21 == 7339377);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28621 + "'", int23 == 28621);
    }

    @Test
    public void test21684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration15.setaudioDeviceBufferCount(852308735);
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration15.initialBackgroundColor;
        int int19 = lwjgl3ApplicationConfiguration15.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test21685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21685");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1677696502, (float) (-243712), (float) (-35), (float) (-17355300));
    }

    @Test
    public void test21686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-240), (-334888960), 3104);
        lwjgl3ApplicationConfiguration0.setWindowPosition(65295, (-2015879168));
        lwjgl3ApplicationConfiguration0.g = (-478150656);
        int int26 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowX((-1071604892));
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 65295 + "'", int26 == 65295);
    }

    @Test
    public void test21687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21687");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = color12.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color14);
        color14.g = 65367;
        com.badlogic.gdx.graphics.Color color23 = color14.mul((float) (-2147425792), (float) (-843808), (float) (-81806863), (float) 93);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test21688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21688");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color13 = color8.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color21 = color15.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str23 = color22.toString();
        com.badlogic.gdx.graphics.Color color25 = color15.lerp(color22, (-8.0750596E37f));
        boolean boolean26 = color8.equals((java.lang.Object) color15);
        com.badlogic.gdx.graphics.Color color27 = color7.add(color8);
        float float28 = color27.r;
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, (-14622977));
        com.badlogic.gdx.graphics.Color color35 = color27.mul(3.6948E-41f, (float) (-18874624), (float) (-159989760), (float) (-65568));
        com.badlogic.gdx.graphics.Color color36 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color41 = color36.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color36);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color42);
        java.lang.String str44 = color42.toString();
        com.badlogic.gdx.graphics.Color color45 = new com.badlogic.gdx.graphics.Color(color42);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color49 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color55 = color49.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color56 = color47.mul(color55);
        com.badlogic.gdx.graphics.Color color58 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color64 = color58.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color64.g = (short) 1;
        com.badlogic.gdx.graphics.Color color68 = color56.lerp(color64, (float) 25500);
        com.badlogic.gdx.graphics.Color color73 = color56.mul(0.0f, (float) (-8142), (float) (-1562574848), (-1.0f));
        color56.g = '#';
        com.badlogic.gdx.graphics.Color color76 = color45.set(color56);
        com.badlogic.gdx.graphics.Color color81 = color56.mul((-1.7013883E38f), (float) 4095, (float) (-79360), 0.13725491f);
        com.badlogic.gdx.graphics.Color color82 = new com.badlogic.gdx.graphics.Color(color56);
        com.badlogic.gdx.graphics.Color color84 = color35.lerp(color82, (-1.6995686E38f));
        color84.r = 16719871;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00ff0000" + "'", str23, "00ff0000");
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ffffff00" + "'", str44, "ffffff00");
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(color81);
        org.junit.Assert.assertNotNull(color84);
    }

    @Test
    public void test21689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("4169e1ff");
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNull(fileType14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21690");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(1743728353);
    }

    @Test
    public void test21691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (-2550);
        lwjgl3ApplicationConfiguration0.setWindowPosition(16768546, (-2147483616));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode12 = lwjgl3ApplicationConfiguration8.fullscreenMode;
        int int13 = lwjgl3ApplicationConfiguration8.getsamples();
        com.badlogic.gdx.graphics.Color color14 = lwjgl3ApplicationConfiguration8.initialBackgroundColor;
        lwjgl3ApplicationConfiguration8.setuseGL30(false);
        lwjgl3ApplicationConfiguration8.audioDeviceBufferSize = (-536940544);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertNull(lwjgl3DisplayMode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test21693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21693");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        com.badlogic.gdx.graphics.Color color9 = color4.add((-8.0750596E37f), (float) 20188, (float) 10L, (float) 31334400);
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) 100L);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color17, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color46 = color17.add((-4.581683E37f), (float) (-402678048), 1.7014117E38f, (float) (-12632257));
        float float47 = color17.toFloatBits();
        com.badlogic.gdx.graphics.Color color49 = color17.set(16);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 2.3418052E-38f + "'", float47 == 2.3418052E-38f);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test21694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21694");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits(234872319, (-570429935), 0, 1442844146);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.700529E38f) + "'", float4 == (-1.700529E38f));
    }

    @Test
    public void test21695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
    }

    @Test
    public void test21696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21696");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) 20160, (float) 0, (float) (byte) -1);
        java.lang.Object obj5 = null;
        boolean boolean6 = color4.equals(obj5);
        int int7 = color4.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((-8.815718E32f), (float) (-1291891232), (float) (-2117940064), (float) (-85425));
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color16 = color13.add(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.MAGENTA;
        com.badlogic.gdx.graphics.Color color18 = color16.set(color17);
        com.badlogic.gdx.graphics.Color color20 = color8.lerp(color18, (float) (-8414));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65535 + "'", int7 == 65535);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test21697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-2147222656));
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getuseGL30();
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int4 = lwjgl3ApplicationConfiguration0.samples;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int7 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.depth = (-2359296);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test21699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 70560;
        int int10 = lwjgl3ApplicationConfiguration0.b;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test21700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21700");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-2142638528));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, (-16777216));
        int int4 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16711680 + "'", int4 == 16711680);
    }

    @Test
    public void test21701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType15 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.setdepth(480);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = lwjgl3ApplicationConfiguration0.windowListener;
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        java.lang.String str24 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int25 = lwjgl3ApplicationConfiguration0.depth;
        int int26 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNull(lwjgl3WindowListener22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".prefs/" + "'", str24, ".prefs/");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 480 + "'", int25 == 480);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test21702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode10;
        lwjgl3ApplicationConfiguration0.setsamples(65024);
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 16649715;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int20 = lwjgl3ApplicationConfiguration0.g;
        int int21 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(lwjgl3WindowListener22);
    }

    @Test
    public void test21703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.b = '4';
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowY = 3;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 167709184;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        boolean boolean19 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 480 + "'", int18 == 480);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test21704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 3855;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-65486));
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        lwjgl3ApplicationConfiguration0.a = (-2143297280);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 653309;
        lwjgl3ApplicationConfiguration0.windowHeight = (-32509696);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 480 + "'", int19 == 480);
    }

    @Test
    public void test21705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.windowResizable;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21706");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color41 = color32.mul(color40);
        com.badlogic.gdx.graphics.Color color42 = new com.badlogic.gdx.graphics.Color(color32);
        com.badlogic.gdx.graphics.Color color43 = color26.set(color42);
        com.badlogic.gdx.graphics.Color color44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color color45 = color43.mul(color44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test21707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.r = (byte) -1;
        lwjgl3ApplicationConfiguration10.preferencesDirectory = "ffffff00";
        boolean boolean15 = lwjgl3ApplicationConfiguration10.windowResizable;
        lwjgl3ApplicationConfiguration10.setwindowX((-16646655));
        lwjgl3ApplicationConfiguration10.setResizable(true);
        int int20 = lwjgl3ApplicationConfiguration10.stencil;
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(fileType21);
    }

    @Test
    public void test21708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21708");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode13);
        lwjgl3ApplicationConfiguration12.samples = (-1);
        boolean boolean17 = lwjgl3ApplicationConfiguration12.initialVisible;
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.BLACK;
        float float19 = color18.r;
        com.badlogic.gdx.graphics.Color color24 = color18.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration12.initialBackgroundColor = color18;
        com.badlogic.gdx.graphics.Color color26 = color18.cpy();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color28 = color11.mul(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color30 = com.badlogic.gdx.graphics.Color.TEAL;
        com.badlogic.gdx.graphics.Color color31 = color29.mul(color30);
        com.badlogic.gdx.graphics.Color color36 = color29.sub((float) 1L, (float) (-27809536), (float) (-1), (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color37 = color28.set(color29);
        float float38 = color29.a;
        com.badlogic.gdx.graphics.Color color43 = color29.mul((float) (-18874624), 1.84552666E9f, (float) (-232), (float) (-10223586));
        com.badlogic.gdx.graphics.Color color49 = color29.lerp((float) (-7651328), (float) 34277, (float) (-246), (float) (-1644167168), (float) 14047);
        color29.b = 3.6969962E36f;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.016916571f + "'", float5 == 0.016916571f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(color18);
// flaky:         org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8784314f + "'", float19 == 0.8784314f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
// flaky:         org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test21709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration3.windowListener = lwjgl3WindowListener4;
        boolean boolean6 = lwjgl3ApplicationConfiguration3.getdisableAudio();
        int int7 = lwjgl3ApplicationConfiguration3.getgles30ContextMajorVersion();
        java.lang.String str8 = lwjgl3ApplicationConfiguration3.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType10);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        int int14 = lwjgl3ApplicationConfiguration9.windowY;
        lwjgl3ApplicationConfiguration9.setWindowPosition((int) ' ', 512);
        lwjgl3ApplicationConfiguration9.setWindowedMode((-59160), (-1562574848));
        lwjgl3ApplicationConfiguration9.windowX = 587162524;
        lwjgl3ApplicationConfiguration9.vSyncEnabled = false;
        int int25 = lwjgl3ApplicationConfiguration9.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration9.setwindowY(16761475);
        lwjgl3ApplicationConfiguration9.setgles30ContextMinorVersion((-16580865));
        boolean boolean30 = lwjgl3ApplicationConfiguration9.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = lwjgl3ApplicationConfiguration9.hdpiMode;
        lwjgl3ApplicationConfiguration3.setHdpiMode(hdpiMode31);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(50200831, (-128512), (-65025));
        int int21 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setwindowX(970962282);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-65025) + "'", int21 == (-65025));
    }

    @Test
    public void test21711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21711");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(7.2138E-39f, (float) (-110329856), (float) (-62986), (float) (-2336));
        float float5 = color4.g;
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test21712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21712");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(16710672, 1323222528, (-134242816), (-1308557313));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-66544) + "'", int4 == (-66544));
    }

    @Test
    public void test21713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21713");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(20188);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration8.setgles30ContextMinorVersion((-2147222656));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = lwjgl3ApplicationConfiguration8.windowListener;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20188 + "'", int14 == 20188);
        org.junit.Assert.assertNull(lwjgl3WindowListener17);
    }

    @Test
    public void test21714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21714");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setwindowX((-62986));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        lwjgl3ApplicationConfiguration14.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        int int24 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration25.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration25.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.samples = (-1);
        lwjgl3ApplicationConfiguration30.useGL30 = true;
        lwjgl3ApplicationConfiguration30.setpreferencesDirectory("ffff72ff");
        int int39 = lwjgl3ApplicationConfiguration30.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration30.windowY = 20188;
        int int42 = lwjgl3ApplicationConfiguration30.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = lwjgl3ApplicationConfiguration30.hdpiMode;
        lwjgl3ApplicationConfiguration25.hdpiMode = hdpiMode43;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        int int47 = lwjgl3ApplicationConfiguration0.windowY;
        boolean boolean48 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowX((-1077348352));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration21);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test21715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21715");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-16));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color12 = color7.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str13 = color12.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color12, 1);
        com.badlogic.gdx.graphics.Color color20 = color12.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color26 = color20.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color31 = color26.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float32 = color26.toFloatBits();
        com.badlogic.gdx.graphics.Color color33 = color6.mul(color26);
        com.badlogic.gdx.graphics.Color color34 = color1.sub(color6);
        com.badlogic.gdx.graphics.Color color36 = color6.mul((float) 16776961);
        com.badlogic.gdx.graphics.Color color41 = color6.mul((float) (-8142), (float) (-4199936), (float) (-1288437), (float) 251649808);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ffffde00" + "'", str13, "ffffde00");
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-4.28676E37f) + "'", float32 == (-4.28676E37f));
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test21716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21716");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.samples = 255;
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        boolean boolean10 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21717");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        int int8 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        int int9 = com.badlogic.gdx.graphics.Color.argb8888(color7);
        com.badlogic.gdx.graphics.Color color11 = color7.set(3);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color((-2076210));
        com.badlogic.gdx.graphics.Color color15 = color11.sub(color14);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16777215 + "'", int8 == 16777215);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16777215 + "'", int9 == 16777215);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test21718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21718");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration0.samples = 51;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21719");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.graphics.Color color12 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test21720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21720");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.b = (-1241513983);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color4);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color4, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color11 = color4.mul((float) 16580354);
        color11.r = 3855;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SKY;
        int int15 = com.badlogic.gdx.graphics.Color.argb8888(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str17 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.a = (-1);
        boolean boolean20 = lwjgl3ApplicationConfiguration16.vSyncEnabled;
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color23 = lwjgl3ApplicationConfiguration16.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color24 = color14.mul(color23);
        com.badlogic.gdx.graphics.Color color25 = color23.cpy();
        com.badlogic.gdx.graphics.Color color26 = color11.set(color23);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color26);
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(3);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color29, (-16734721));
        color29.a = 480;
        color29.a = (-2336);
        com.badlogic.gdx.graphics.Color color37 = color29.mul((float) (-59160));
        float float38 = color37.toFloatBits();
        com.badlogic.gdx.graphics.Color color40 = color26.lerp(color37, (float) 51);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2130709504) + "'", int15 == (-2130709504));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-4.2535296E37f) + "'", float38 == (-4.2535296E37f));
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test21721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21721");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-254));
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.Files.FileType fileType12 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setTitle("eebae6ff");
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff08ff";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + fileType12 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType12.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21722");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 56864;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int11 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test21723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21723");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        int int15 = lwjgl3ApplicationConfiguration14.windowWidth;
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("", fileType24);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration18.preferencesFileType;
        int int27 = lwjgl3ApplicationConfiguration18.samples;
        int int28 = lwjgl3ApplicationConfiguration18.windowHeight;
        lwjgl3ApplicationConfiguration18.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color33 = lwjgl3ApplicationConfiguration18.initialBackgroundColor;
        lwjgl3ApplicationConfiguration18.setDecorated(false);
        boolean boolean36 = lwjgl3ApplicationConfiguration18.windowDecorated;
        lwjgl3ApplicationConfiguration18.preferencesDirectory = "ffffffb6";
        int int39 = lwjgl3ApplicationConfiguration18.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int41 = lwjgl3ApplicationConfiguration40.getaudioDeviceBufferSize();
        boolean boolean42 = lwjgl3ApplicationConfiguration40.windowResizable;
        int int43 = lwjgl3ApplicationConfiguration40.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration40.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration40);
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration46.preferencesFileType;
        boolean boolean48 = lwjgl3ApplicationConfiguration46.getdisableAudio();
        boolean boolean49 = lwjgl3ApplicationConfiguration46.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType52 = null;
        lwjgl3ApplicationConfiguration51.setpreferencesFileType(fileType52);
        lwjgl3ApplicationConfiguration51.disableAudio = true;
        lwjgl3ApplicationConfiguration51.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType58 = lwjgl3ApplicationConfiguration51.getpreferencesFileType();
        lwjgl3ApplicationConfiguration51.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType61 = lwjgl3ApplicationConfiguration51.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode64 = null;
        lwjgl3ApplicationConfiguration63.setFullscreenMode(displayMode64);
        lwjgl3ApplicationConfiguration63.samples = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType72 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration68.setPreferencesConfig("hi!", fileType72);
        lwjgl3ApplicationConfiguration63.setpreferencesFileType(fileType72);
        lwjgl3ApplicationConfiguration51.setPreferencesConfig("00ff0000", fileType72);
        lwjgl3ApplicationConfiguration46.setPreferencesConfig("88bb2222", fileType72);
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType72;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType72);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = lwjgl3ApplicationConfiguration14.hdpiMode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
        org.junit.Assert.assertNull(fileType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 480 + "'", int28 == 480);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 512 + "'", int41 == 512);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration46);
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(fileType58);
        org.junit.Assert.assertNull(fileType61);
        org.junit.Assert.assertTrue("'" + fileType72 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType72.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21724");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        int int24 = com.badlogic.gdx.graphics.Color.rgba8888(color9);
        com.badlogic.gdx.graphics.Color color29 = color9.mul((float) (-7936), (float) 852308735, (float) (byte) 0, (float) (-1902614));
        com.badlogic.gdx.graphics.Color color34 = color9.mul((float) (-1714481152), (float) (-1308557313), (-1.6950762E38f), (float) (-2176));
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color9, 19040);
        int int37 = com.badlogic.gdx.graphics.Color.rgba8888(color9);
        float float38 = color9.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-256) + "'", int24 == (-256));
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4874240 + "'", int37 == 4874240);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.3764706f + "'", float38 == 0.3764706f);
    }

    @Test
    public void test21725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21725");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setWindowedMode(480, (-61455));
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int14 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int15 = lwjgl3ApplicationConfiguration0.r;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test21726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21726");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion(65025);
        lwjgl3ApplicationConfiguration16.initialVisible = true;
        int int21 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Files.FileType fileType26 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ff660000", fileType26);
        int int29 = lwjgl3ApplicationConfiguration16.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        lwjgl3ApplicationConfiguration16.setsamples(16668585);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration30);
    }

    @Test
    public void test21727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21727");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color1, 1);
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration5.setDecorated(false);
        lwjgl3ApplicationConfiguration5.a = (byte) 10;
        boolean boolean10 = lwjgl3ApplicationConfiguration5.initialVisible;
        int int11 = lwjgl3ApplicationConfiguration5.b;
        lwjgl3ApplicationConfiguration5.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration5.initialBackgroundColor = color14;
        com.badlogic.gdx.graphics.Color color17 = color4.lerp(color14, 0.0f);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color21 = color19.set(color20);
        com.badlogic.gdx.graphics.Color color22 = color21.cpy();
        color22.a = 16777215;
        com.badlogic.gdx.graphics.Color color29 = color22.set((float) 65025, (float) 537395200, (float) (-652800), (float) (-1109610));
        com.badlogic.gdx.graphics.Color color30 = color4.set(color29);
        com.badlogic.gdx.graphics.Color color35 = color30.sub((float) (-59392), (float) (-194841600), (float) (-32), (float) (-16777184));
        int int36 = com.badlogic.gdx.graphics.Color.rgb565(color35);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 65535 + "'", int36 == 65535);
    }

    @Test
    public void test21728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21728");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        lwjgl3ApplicationConfiguration8.setAudioConfig(512, (-14540110), (int) (byte) 1);
        int int13 = lwjgl3ApplicationConfiguration8.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int16 = lwjgl3ApplicationConfiguration8.audioDeviceBufferCount;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test21729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21729");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.windowY = 43268;
        com.badlogic.gdx.graphics.Color color10 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(178);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test21730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21730");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener18;
        boolean boolean20 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("5bcf04dc");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test21731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21731");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(765);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        com.badlogic.gdx.graphics.Color color3 = color2.cpy();
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(color2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test21732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21732");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.b = 16769536;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int20 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test21733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21733");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = null;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener12;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1179648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test21734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21734");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (short) -1;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-10), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setwindowWidth(250675200);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.stencil = (-65784);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-524869));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test21735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21735");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) (-63743), (float) 495, 0.0019225858f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.5949177E38f) + "'", float4 == (-1.5949177E38f));
    }

    @Test
    public void test21736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21736");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.windowWidth = 6356992;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21737");
        float float4 = com.badlogic.gdx.graphics.Color.toFloatBits((float) 16772625, 0.0f, (float) (-9726720), (float) (-16711680));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.7014117E38f + "'", float4 == 1.7014117E38f);
    }

    @Test
    public void test21738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21738");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-2015879168), (float) (-1677417472), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 255 + "'", int3 == 255);
    }

    @Test
    public void test21739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21739");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((-1.435E-42f), (float) (-1958400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-499392000) + "'", int2 == (-499392000));
    }

    @Test
    public void test21740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21740");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.FOREST;
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        com.badlogic.gdx.graphics.Color color6 = color1.lerp(color3, (float) (-50396672));
        int int7 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        com.badlogic.gdx.graphics.Color color8 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color14 = color9.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color15);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color22 = color17.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color30 = color24.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str32 = color31.toString();
        com.badlogic.gdx.graphics.Color color34 = color24.lerp(color31, (-8.0750596E37f));
        boolean boolean35 = color17.equals((java.lang.Object) color24);
        com.badlogic.gdx.graphics.Color color36 = color16.add(color17);
        com.badlogic.gdx.graphics.Color color38 = color8.lerp(color16, (float) (-14540110));
        int int39 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        com.badlogic.gdx.graphics.Color color40 = color6.sub(color8);
        float float41 = color40.toFloatBits();
        int int42 = com.badlogic.gdx.graphics.Color.rgb565(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration43.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode49 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode49);
        lwjgl3ApplicationConfiguration48.samples = (-1);
        lwjgl3ApplicationConfiguration48.useGL30 = true;
        lwjgl3ApplicationConfiguration48.setpreferencesDirectory("ffff72ff");
        int int57 = lwjgl3ApplicationConfiguration48.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration48.windowY = 20188;
        int int60 = lwjgl3ApplicationConfiguration48.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = lwjgl3ApplicationConfiguration48.hdpiMode;
        lwjgl3ApplicationConfiguration43.hdpiMode = hdpiMode61;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration43);
        com.badlogic.gdx.graphics.Color color64 = lwjgl3ApplicationConfiguration63.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color65 = color40.sub(color64);
        color40.g = (-6.370565E37f);
        float float68 = color40.b;
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-256) + "'", int2 == (-256));
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-256) + "'", int7 == (-256));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00ff0000" + "'", str32, "00ff0000");
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2047 + "'", int39 == 2047);
        org.junit.Assert.assertNotNull(color40);
// flaky:         org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-4.253659E37f) + "'", float41 == (-4.253659E37f));
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 63488 + "'", int42 == 63488);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration63);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
    }

    @Test
    public void test21741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21741");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration65.r = (-1902614);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration65);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener69 = null;
        lwjgl3ApplicationConfiguration68.setWindowListener(lwjgl3WindowListener69);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration65);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration68);
    }

    @Test
    public void test21742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21742");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setwindowX(640);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (short) 1;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int14 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowWidth = (-2219520);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test21743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21743");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.useGL30;
        com.badlogic.gdx.graphics.Color color17 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color((float) 2, (float) 100, (float) (short) 0, (float) 640);
        com.badlogic.gdx.graphics.Color color27 = color22.add((-8.0750596E37f), (float) 20188, (float) 10L, (float) 31334400);
        com.badlogic.gdx.graphics.Color color28 = color17.mul(color27);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color27, (-704643584));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test21744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21744");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-28458960), (float) 587202527, (float) (-246), 0.12903225f);
    }

    @Test
    public void test21745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21745");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 10);
        lwjgl3ApplicationConfiguration0.g = 65295;
        int int18 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int19 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.title = "0000ff00";
        int int22 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test21746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21746");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int12 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.title = "ff000000";
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        boolean boolean18 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test21747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21747");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.title = "88bb2222";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test21748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21748");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, (int) 'a');
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color15 = color10.lerp(color13, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str17 = color16.toString();
        com.badlogic.gdx.graphics.Color color18 = color13.sub(color16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "00ff0000" + "'", str17, "00ff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test21749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21749");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-254));
        int int11 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int12 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(26129);
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20188 + "'", int11 == 20188);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 640 + "'", int15 == 640);
    }

    @Test
    public void test21750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21750");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        int int3 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.graphics.Color color4 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color9 = color4.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        int int10 = com.badlogic.gdx.graphics.Color.rgb888(color9);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color16 = color11.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color11, 1671296512);
        java.lang.String str19 = color11.toString();
        int int20 = com.badlogic.gdx.graphics.Color.rgba4444(color11);
        com.badlogic.gdx.graphics.Color color21 = color9.set(color11);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 151015132);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color11;
        java.lang.String str25 = color11.toString();
        com.badlogic.gdx.graphics.Color color27 = color11.mul(0.19354838f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16776960 + "'", int10 == 16776960);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ff660000" + "'", str19, "ff660000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 62976 + "'", int20 == 62976);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4adae600" + "'", str25, "4adae600");
        org.junit.Assert.assertNotNull(color27);
    }

    @Test
    public void test21751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21751");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-533476352));
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color1, 47616);
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 186 + "'", int4 == 186);
    }

    @Test
    public void test21752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21752");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        float float54 = color18.a;
        com.badlogic.gdx.graphics.Color color59 = color18.add((float) (-16777215), (float) (byte) 10, (float) 43268, (float) 3855);
        com.badlogic.gdx.graphics.Color color64 = color18.sub((float) 1794115036, (float) (-520154880), 0.0f, (float) (-2059518976));
        com.badlogic.gdx.graphics.Color color65 = color18.clamp();
        color65.a = 14605824;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16737792 + "'", int14 == 16737792);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(color18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16776960 + "'", int19 == 16776960);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "00ff0000" + "'", str44, "00ff0000");
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2047 + "'", int51 == 2047);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
    }

    @Test
    public void test21753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21753");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-4351), (float) (-1411395173), (float) 2097086464, (-65358.0f));
    }

    @Test
    public void test21754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21754");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setTitle("ffff0200");
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test21755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21755");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 65290;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = 16640;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test21756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21756");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean7 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setwindowX((-1291845633));
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.windowHeight = 14745429;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration14.setpreferencesFileType(fileType15);
        lwjgl3ApplicationConfiguration14.setWindowedMode((-256), (-65025));
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode20);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float24 = color23.a;
        com.badlogic.gdx.graphics.Color color29 = color23.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        int int30 = com.badlogic.gdx.graphics.Color.rgba4444(color23);
        com.badlogic.gdx.graphics.Color color31 = color23.cpy();
        lwjgl3ApplicationConfiguration14.initialBackgroundColor = color23;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        lwjgl3ApplicationConfiguration33.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType40 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        lwjgl3ApplicationConfiguration33.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration33.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration45.setFullscreenMode(displayMode46);
        lwjgl3ApplicationConfiguration45.samples = (-1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType54 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration50.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration45.setpreferencesFileType(fileType54);
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("00ff0000", fileType54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        com.badlogic.gdx.Files.FileType fileType59 = lwjgl3ApplicationConfiguration58.getpreferencesFileType();
        lwjgl3ApplicationConfiguration14.preferencesFileType = fileType59;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 65295 + "'", int30 == 65295);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(fileType40);
        org.junit.Assert.assertNull(fileType43);
        org.junit.Assert.assertTrue("'" + fileType54 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType54.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration58);
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.Absolute));
    }

    @Test
    public void test21757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21757");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        lwjgl3ApplicationConfiguration16.windowX = 0;
        int int20 = lwjgl3ApplicationConfiguration16.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test21758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21758");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.windowY = 0;
        lwjgl3ApplicationConfiguration0.setTitle("4169e1ff");
        lwjgl3ApplicationConfiguration0.setwindowWidth((-4199936));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test21759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21759");
        int int3 = com.badlogic.gdx.graphics.Color.rgb888((float) (-1340080128), (float) (-130560), (float) (-52608));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-45696) + "'", int3 == (-45696));
    }

    @Test
    public void test21760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21760");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color2, 16);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color2);
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowY((-8414));
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        int int10 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.gles30ContextMajorVersion = ' ';
        java.lang.String str14 = lwjgl3ApplicationConfiguration11.title;
        lwjgl3ApplicationConfiguration11.a = 58111;
        lwjgl3ApplicationConfiguration11.depth = (-65042);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int20 = lwjgl3ApplicationConfiguration19.getaudioDeviceBufferSize();
        boolean boolean21 = lwjgl3ApplicationConfiguration19.windowResizable;
        lwjgl3ApplicationConfiguration19.disableAudio = false;
        lwjgl3ApplicationConfiguration19.setwindowHeight((int) (byte) 10);
        int int26 = lwjgl3ApplicationConfiguration19.getdepth();
        lwjgl3ApplicationConfiguration19.setaudioDeviceBufferSize((int) (byte) -1);
        lwjgl3ApplicationConfiguration19.setWindowPosition((-1611265692), (-50135050));
        lwjgl3ApplicationConfiguration19.gles30ContextMajorVersion = (-61455);
        lwjgl3ApplicationConfiguration19.a = (-10026973);
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration19.preferencesFileType;
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType36);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21761");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SCARLET;
        color0.b = '#';
        com.badlogic.gdx.graphics.Color color3 = com.badlogic.gdx.graphics.Color.ORANGE;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color3, (-524536));
        color3.r = (-510);
        com.badlogic.gdx.graphics.Color color9 = color0.lerp(color3, (float) 3306396);
        int int10 = com.badlogic.gdx.graphics.Color.argb8888(color3);
        java.lang.String str11 = color3.toString();
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color3, 786);
        java.lang.String str14 = color3.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-65784) + "'", int10 == (-65784));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "feff08ff" + "'", str11, "feff08ff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00031200" + "'", str14, "00031200");
    }

    @Test
    public void test21762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21762");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int11 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.samples = (-8520704);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test21763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21763");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1611265692), (-50135050));
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-61455);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.valueOf("6b8e23ff");
        com.badlogic.gdx.graphics.Color color20 = color18.mul((float) (short) 1);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        lwjgl3ApplicationConfiguration0.windowHeight = (-112792302);
        lwjgl3ApplicationConfiguration0.windowDecorated = false;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test21764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21764");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.r = 20188;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.a = 11667711;
        int int12 = lwjgl3ApplicationConfiguration0.samples;
        int int13 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        boolean boolean14 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 640 + "'", int13 == 640);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test21765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21765");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.r = 140834847;
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-1306385665);
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.samples = '4';
        int int18 = lwjgl3ApplicationConfiguration13.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType23 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("hi!", fileType23);
        lwjgl3ApplicationConfiguration13.preferencesFileType = fileType23;
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        int int28 = lwjgl3ApplicationConfiguration13.getsamples();
        int int29 = lwjgl3ApplicationConfiguration13.getwindowX();
        java.lang.String str30 = lwjgl3ApplicationConfiguration13.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode31 = null;
        lwjgl3ApplicationConfiguration13.fullscreenMode = lwjgl3DisplayMode31;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType39);
        java.lang.String str41 = lwjgl3ApplicationConfiguration33.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = lwjgl3ApplicationConfiguration42.hdpiMode;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode43);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration42);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21766");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 43268, 9);
        int int11 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1902614));
        int int14 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.windowY = (-65486);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00fd1300", fileType20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test21767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21767");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.GOLDENROD;
        color0.g = 35;
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(3);
        color4.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color7 = color4.clamp();
        com.badlogic.gdx.graphics.Color color12 = color7.sub((float) (-14540110), (float) (short) -1, (float) (-14513374), (float) 2);
        com.badlogic.gdx.graphics.Color color13 = color0.add(color12);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color19 = color14.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color14);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color20);
        int int22 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        int int23 = com.badlogic.gdx.graphics.Color.argb8888(color21);
        com.badlogic.gdx.graphics.Color color25 = color21.set(3);
        com.badlogic.gdx.graphics.Color color26 = color0.sub(color25);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        boolean boolean29 = color26.equals((java.lang.Object) (short) -1);
        com.badlogic.gdx.graphics.Color color34 = color26.sub((float) 0L, (-4.2865007E37f), 2.3509886E-38f, (float) (-8672));
        float float35 = color26.toFloatBits();
        com.badlogic.gdx.graphics.Color color40 = color26.sub((float) (-16), (float) 35, (float) (-65025), (float) 11667711);
        int int41 = com.badlogic.gdx.graphics.Color.rgba4444(color26);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16777215 + "'", int22 == 16777215);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16777215 + "'", int23 == 16777215);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.7014117E38f) + "'", float35 == (-1.7014117E38f));
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 61680 + "'", int41 == 61680);
    }

    @Test
    public void test21768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21768");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX(16776961);
        int int12 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowX(34277);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.title = "030c00fc";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16776961 + "'", int12 == 16776961);
    }

    @Test
    public void test21769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21769");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.g;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setsamples((-2147438080));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1175257658), 46087);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21770");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha((float) (-232), (-1.6956224E38f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15144960) + "'", int2 == (-15144960));
    }

    @Test
    public void test21771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21771");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.a = 246;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration14.getaudioDeviceBufferCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test21772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21772");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        int int11 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test21773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21773");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowY = 8;
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color13 = color11.set(color12);
        com.badlogic.gdx.graphics.Color color14 = color13.cpy();
        color14.a = 16777215;
        com.badlogic.gdx.graphics.Color color21 = color14.set((float) 65025, (float) 537395200, (float) (-652800), (float) (-1109610));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.String str27 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 65119;
        int int30 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ".prefs/" + "'", str27, ".prefs/");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test21774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21774");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.stencil = (-1306385665);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test21775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21775");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration6.setFullscreenMode(displayMode7);
        lwjgl3ApplicationConfiguration6.windowX = 100;
        int int11 = lwjgl3ApplicationConfiguration6.stencil;
        int int12 = lwjgl3ApplicationConfiguration6.windowY;
        lwjgl3ApplicationConfiguration6.a = 43268;
        int int15 = lwjgl3ApplicationConfiguration6.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration6.setdepth(512);
        lwjgl3ApplicationConfiguration6.g = (byte) 10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration20.setpreferencesFileType(fileType21);
        lwjgl3ApplicationConfiguration20.useVsync(false);
        lwjgl3ApplicationConfiguration20.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration20.a = (-62986);
        lwjgl3ApplicationConfiguration20.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration20.hdpiMode = hdpiMode32;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int37 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setwindowY((-62527));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration40.title = "ac0000ff";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
    }

    @Test
    public void test21776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21776");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-2105704448), (float) 2048, (float) (-587202461), 1.7705992E21f);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str6 = lwjgl3ApplicationConfiguration5.title;
        lwjgl3ApplicationConfiguration5.a = (-1);
        boolean boolean9 = lwjgl3ApplicationConfiguration5.vSyncEnabled;
        lwjgl3ApplicationConfiguration5.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration5.useVsync(true);
        lwjgl3ApplicationConfiguration5.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration5.audioDeviceBufferCount = 167247232;
        com.badlogic.gdx.graphics.Color color24 = lwjgl3ApplicationConfiguration5.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color29 = color24.mul((float) 1, (float) (-240), 2.3418409E-38f, (float) 100);
        java.lang.String str30 = color24.toString();
        com.badlogic.gdx.graphics.Color color31 = color4.add(color24);
        int int32 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color34 = color4.set((-7680));
        com.badlogic.gdx.graphics.Color color39 = color4.sub((float) (-119406593), (-4.818329E37f), (float) 53247, (float) (-499392000));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "00000000" + "'", str30, "00000000");
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16711935 + "'", int32 == 16711935);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test21777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21777");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdepth(100);
        lwjgl3ApplicationConfiguration0.b = 480;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color10, 16);
        float float13 = color10.toFloatBits();
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color10);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        java.lang.String str16 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int17 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.561203E-39f + "'", float13 == 1.561203E-39f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".prefs/" + "'", str16, ".prefs/");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test21778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21778");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("6b8e23ff");
        com.badlogic.gdx.graphics.Color color3 = color1.mul((float) (short) 1);
        color3.b = (-16711681);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color3, (-396800));
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color3);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test21779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21779");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowY = 20188;
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int15 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test21780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21780");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int7 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode9;
        lwjgl3ApplicationConfiguration0.windowX = 512;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-10555392));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode9 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode9.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21781");
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444((float) (-56798), (float) (-1203355648), (float) 196080, (float) 30474224);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1073741568 + "'", int4 == 1073741568);
    }

    @Test
    public void test21782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21782");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-1607680));
    }

    @Test
    public void test21783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21783");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.windowHeight = 3845;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test21784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21784");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color13 = color12.cpy();
        int int14 = com.badlogic.gdx.graphics.Color.argb8888(color13);
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.FOREST;
        int int16 = com.badlogic.gdx.graphics.Color.argb8888(color15);
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color15, (float) (-50396672));
        int int19 = com.badlogic.gdx.graphics.Color.argb8888(color18);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color26 = color21.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color(color27);
        com.badlogic.gdx.graphics.Color color29 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color34 = color29.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color36 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color42 = color36.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str44 = color43.toString();
        com.badlogic.gdx.graphics.Color color46 = color36.lerp(color43, (-8.0750596E37f));
        boolean boolean47 = color29.equals((java.lang.Object) color36);
        com.badlogic.gdx.graphics.Color color48 = color28.add(color29);
        com.badlogic.gdx.graphics.Color color50 = color20.lerp(color28, (float) (-14540110));
        int int51 = com.badlogic.gdx.graphics.Color.rgb565(color20);
        com.badlogic.gdx.graphics.Color color52 = color18.sub(color20);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color18;
        boolean boolean54 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.g = (-16711936);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int58 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.stencil = (-18881792);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-65281));
        boolean boolean63 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int64 = lwjgl3ApplicationConfiguration0.getwindowY();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16737792 + "'", int14 == 16737792);
        org.junit.Assert.assertNotNull(color15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(color18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16776960 + "'", int19 == 16776960);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "00ff0000" + "'", str44, "00ff0000");
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(color50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2047 + "'", int51 == 2047);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test21785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21785");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ff660000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration13.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration13.windowX = 100;
        int int18 = lwjgl3ApplicationConfiguration13.stencil;
        int int19 = lwjgl3ApplicationConfiguration13.windowY;
        lwjgl3ApplicationConfiguration13.a = 43268;
        int int22 = lwjgl3ApplicationConfiguration13.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType23 = lwjgl3ApplicationConfiguration13.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff65b6", fileType23);
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.windowWidth = 3840;
        boolean boolean29 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-511707136), (-1308557313), (int) (short) 1, (-602880), (-450756096), 6180224, (-68935680));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + fileType23 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType23.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test21786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21786");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.6614816E38f), (float) (-1291845633), (float) (-2076210), (float) (-2015879168));
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        int int7 = com.badlogic.gdx.graphics.Color.rgb565(color6);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color6, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color11 = color6.mul((float) 573767680);
        com.badlogic.gdx.graphics.Color color16 = color11.sub((float) (-1562574848), (float) (-2015879168), (-5.360365E37f), (float) 100L);
        com.badlogic.gdx.graphics.Color color17 = color5.set(color16);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color5, 17);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color5, (-195840));
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65504 + "'", int7 == 65504);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test21787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21787");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        com.badlogic.gdx.Files.FileType fileType9 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowWidth = (-66048);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.windowX = (-14671700);
        int int15 = lwjgl3ApplicationConfiguration0.windowWidth;
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + fileType9 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType9.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-66048) + "'", int15 == (-66048));
    }

    @Test
    public void test21788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21788");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-33488131));
        int int12 = lwjgl3ApplicationConfiguration0.windowY;
        int int13 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setsamples(652800);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-30592), (-3342337));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 63487;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test21789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21789");
        int int2 = com.badlogic.gdx.graphics.Color.luminanceAlpha(0.0f, (float) (-65380));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16671900) + "'", int2 == (-16671900));
    }

    @Test
    public void test21790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21790");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.gles30ContextMajorVersion = (-1306385665);
        lwjgl3ApplicationConfiguration10.setwindowX(652800);
        int int15 = lwjgl3ApplicationConfiguration10.g;
        lwjgl3ApplicationConfiguration10.setgles30ContextMajorVersion(0);
        int int18 = lwjgl3ApplicationConfiguration10.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test21791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21791");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        com.badlogic.gdx.Files.FileType fileType5 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setwindowY(33488896);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(63519);
        color10.a = 9.18893E-39f;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color10;
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.CHARTREUSE;
        com.badlogic.gdx.graphics.Color color19 = color14.set((float) (-118095928), (float) 16711935, (float) 16768546, (-1.5084639E38f));
        com.badlogic.gdx.graphics.Color color24 = color14.add((float) (-65536), 0.0f, (float) 16768546, (float) (-2147477600));
        com.badlogic.gdx.graphics.Color color25 = color10.mul(color14);
        com.badlogic.gdx.graphics.Color color30 = color10.set((float) 14660733, (float) (-1318912), 0.0f, (float) 167247232);
        org.junit.Assert.assertTrue("'" + fileType5 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType5.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color30);
    }

    @Test
    public void test21792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21792");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.69803923f, (float) (-1611265692), (float) (byte) 0, (float) (-567943452));
        com.badlogic.gdx.graphics.Color color9 = color4.set((float) 10, (float) 587162524, (-1.6615402E38f), (-1.6974137E38f));
        com.badlogic.gdx.graphics.Color color14 = color9.add((-1.6947138E38f), (float) 184504044, 4.5183064E-38f, (-3.031089E36f));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color14, (-57120));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test21793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21793");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-4.454078E37f), (float) (-1241513983), (-4.2867603E37f), (float) (-396800));
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        com.badlogic.gdx.graphics.Color color10 = color4.add((float) 25500, (float) (-335544321), (-1.6097692E-27f), (float) (-3045376));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color10, (-16777199));
        java.lang.String str13 = color10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00001111" + "'", str13, "00001111");
    }

    @Test
    public void test21794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21794");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        color0.a = (short) 10;
        com.badlogic.gdx.graphics.Color color3 = color0.clamp();
        int int4 = com.badlogic.gdx.graphics.Color.rgba4444(color3);
        com.badlogic.gdx.graphics.Color color6 = color3.mul((float) 65526);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color6, (-1879113728));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255 + "'", int4 == 255);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test21795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21795");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = ' ';
        boolean boolean3 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.Files.FileType fileType4 = com.badlogic.gdx.Files.FileType.Internal;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType4;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.Internal + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.Internal));
    }

    @Test
    public void test21796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21796");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.depth = (-18076896);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertNull(lwjgl3WindowListener7);
    }

    @Test
    public void test21797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21797");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-40036);
        int int17 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 480 + "'", int17 == 480);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test21798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21798");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        int int8 = lwjgl3ApplicationConfiguration0.stencil;
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        lwjgl3ApplicationConfiguration0.stencil = (byte) 0;
        lwjgl3ApplicationConfiguration0.setWindowedMode(16, (-78));
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.setsamples((-1984));
        int int19 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color27 = color22.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color28 = color21.sub(color27);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color21, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color34 = color32.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color35 = color31.set(color32);
        com.badlogic.gdx.graphics.Color color36 = color32.cpy();
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.VIOLET;
        com.badlogic.gdx.graphics.Color color43 = color37.lerp((float) (byte) 100, (float) 8, (float) 10, (float) 9, (float) (-1611265692));
        com.badlogic.gdx.graphics.Color color44 = color32.mul(color43);
        com.badlogic.gdx.graphics.Color color45 = color43.premultiplyAlpha();
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color45;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        java.lang.String str50 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNull(fileType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ".prefs/" + "'", str50, ".prefs/");
    }

    @Test
    public void test21799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21799");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        boolean boolean1 = lwjgl3ApplicationConfiguration0.getuseGL30();
        int int2 = lwjgl3ApplicationConfiguration0.a;
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        boolean boolean5 = lwjgl3ApplicationConfiguration0.useGL30;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType10);
        lwjgl3ApplicationConfiguration9.useVsync(false);
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color14;
        int int16 = lwjgl3ApplicationConfiguration9.depth;
        lwjgl3ApplicationConfiguration9.windowResizable = false;
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration9.initialBackgroundColor;
        float float20 = color19.toFloatBits();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 3.6948E-41f + "'", float20 == 3.6948E-41f);
    }

    @Test
    public void test21800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21800");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.setWindowPosition(16, 130560);
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color14 = color12.set((int) (short) 0);
        int int15 = com.badlogic.gdx.graphics.Color.rgba4444(color12);
        java.lang.String str16 = color12.toString();
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color22 = color17.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color(color17);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color(color23);
        int int25 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        int int26 = com.badlogic.gdx.graphics.Color.argb8888(color24);
        com.badlogic.gdx.graphics.Color color28 = color24.set(3);
        com.badlogic.gdx.graphics.Color color29 = color12.set(color28);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color29;
        boolean boolean31 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.title = "ffffff22";
        int int35 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setdepth(252960);
        int int38 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.samples = (-64);
        int int42 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00000000" + "'", str16, "00000000");
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16777215 + "'", int25 == 16777215);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16777215 + "'", int26 == 16777215);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 130560 + "'", int35 == 130560);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 130560 + "'", int38 == 130560);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
    }

    @Test
    public void test21801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21801");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        int int5 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowX((int) (short) 10);
        int int10 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 480 + "'", int5 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNull(lwjgl3WindowListener20);
    }

    @Test
    public void test21802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21802");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setsamples(2147483647);
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.setwindowY((-1241513983));
        int int8 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "00ffff00";
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-2147483392), (-2550));
        lwjgl3ApplicationConfiguration0.windowY = (-40910);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 480 + "'", int8 == 480);
    }

    @Test
    public void test21803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21803");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode7 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        int int8 = lwjgl3ApplicationConfiguration0.depth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test21804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21804");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowWidth(520091936);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2013528064), 2097152);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test21805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21805");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-135823360), (-1.701338E38f), (float) (-358913), 0.0f);
    }

    @Test
    public void test21806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21806");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 2147483647);
        int int21 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
    }

    @Test
    public void test21807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21807");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType10 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType10;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (byte) 0;
        int int17 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener20;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration24);
    }

    @Test
    public void test21808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21808");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        lwjgl3ApplicationConfiguration0.setwindowX((int) 'a');
        int int14 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.useVsync(false);
        lwjgl3ApplicationConfiguration16.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration16.a = (-62986);
        lwjgl3ApplicationConfiguration16.setdisableAudio(true);
        boolean boolean28 = lwjgl3ApplicationConfiguration16.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration30.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration30.windowX = 100;
        int int35 = lwjgl3ApplicationConfiguration30.g;
        com.badlogic.gdx.Files.FileType fileType36 = lwjgl3ApplicationConfiguration30.getpreferencesFileType();
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ffffff00", fileType36);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("000000ff", fileType36);
        boolean boolean39 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.r = 97;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(166464000);
        int int46 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int49 = lwjgl3ApplicationConfiguration0.getwindowX();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType36 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType36.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 16 + "'", int46 == 16);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
    }

    @Test
    public void test21809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21809");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-7876885), (float) 0L, (float) 6529016, (-0.49791527f));
        com.badlogic.gdx.graphics.Color color6 = color4.set(537395200);
        color4.g = 2;
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color14 = color4.sub((float) 3570, (float) 56864, (float) (-2304), (float) (-33463396));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration15.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration15.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        lwjgl3ApplicationConfiguration15.b = '4';
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        int int29 = lwjgl3ApplicationConfiguration15.getdepth();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setDecorated(false);
        lwjgl3ApplicationConfiguration30.a = (byte) 10;
        boolean boolean35 = lwjgl3ApplicationConfiguration30.initialVisible;
        int int36 = lwjgl3ApplicationConfiguration30.b;
        lwjgl3ApplicationConfiguration30.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration30.initialBackgroundColor = color39;
        boolean boolean41 = lwjgl3ApplicationConfiguration30.useGL30;
        com.badlogic.gdx.Files.FileType fileType42 = lwjgl3ApplicationConfiguration30.preferencesFileType;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType42);
        lwjgl3ApplicationConfiguration15.disableAudio(false);
        lwjgl3ApplicationConfiguration15.windowY = (-2560);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration15.windowListener = lwjgl3WindowListener48;
        int int50 = lwjgl3ApplicationConfiguration15.windowY;
        lwjgl3ApplicationConfiguration15.initialVisible = false;
        boolean boolean53 = color14.equals((java.lang.Object) lwjgl3ApplicationConfiguration15);
        color14.a = 65024;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 570294272 + "'", int9 == 570294272);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration25);
        org.junit.Assert.assertNull(fileType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + fileType42 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType42.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2560) + "'", int50 == (-2560));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test21810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21810");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        color11.a = 35;
        com.badlogic.gdx.graphics.Color color14 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color11);
        float float17 = color16.r;
        com.badlogic.gdx.graphics.Color color18 = color16.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color20 = color18.mul((float) (-2140995584));
        com.badlogic.gdx.graphics.Color color25 = color18.set((float) 268435456, (float) 14811391, (float) (-33560280), (float) 16188608);
        int int26 = color18.toIntBits();
        float float27 = color18.a;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-16711681) + "'", int26 == (-16711681));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
    }

    @Test
    public void test21811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21811");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int6 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.title = "00000000";
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int12 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferSize();
        int int13 = lwjgl3ApplicationConfiguration11.b;
        lwjgl3ApplicationConfiguration11.useGL30 = false;
        lwjgl3ApplicationConfiguration11.useGL30 = true;
        lwjgl3ApplicationConfiguration11.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration11.setwindowX((-16734721));
        int int22 = lwjgl3ApplicationConfiguration11.getdepth();
        java.lang.String str23 = lwjgl3ApplicationConfiguration11.preferencesDirectory;
        lwjgl3ApplicationConfiguration11.setdepth((-49400));
        int int26 = lwjgl3ApplicationConfiguration11.getdepth();
        int int27 = lwjgl3ApplicationConfiguration11.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration28.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration28.disableAudio = true;
        lwjgl3ApplicationConfiguration28.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        lwjgl3ApplicationConfiguration28.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        int int39 = lwjgl3ApplicationConfiguration28.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration28.hdpiMode;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode40);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ".prefs/" + "'", str23, ".prefs/");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-49400) + "'", int26 == (-49400));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNull(fileType35);
        org.junit.Assert.assertNull(fileType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21812");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1241513983), 6147990);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowY(16);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int18 = lwjgl3ApplicationConfiguration0.getdepth();
        int int19 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.graphics.Color color20 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test21813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21813");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(65293);
        int int16 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.depth = 0;
        boolean boolean19 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setwindowY((-134369));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test21814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21814");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        float float6 = color0.a;
        color0.a = (-33463396);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test21815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21815");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        int int7 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int8 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.setwindowHeight(16776961);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test21816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21816");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) (-567943452));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test21817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21817");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        float float10 = color1.r;
        com.badlogic.gdx.graphics.Color color15 = new com.badlogic.gdx.graphics.Color((float) (-3200), (float) (-40036), (float) (-1306385665), (float) 58111);
        com.badlogic.gdx.graphics.Color color16 = color1.add(color15);
        int int17 = color1.toIntBits();
        int int18 = com.badlogic.gdx.graphics.Color.rgb888(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-16777216) + "'", int17 == (-16777216));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test21818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21818");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener18;
        lwjgl3ApplicationConfiguration0.setwindowWidth(0);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.disableAudio;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21819");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-283549696));
    }

    @Test
    public void test21820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21820");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setdepth((-3600));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = lwjgl3ApplicationConfiguration0.windowListener;
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener14);
    }

    @Test
    public void test21821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21821");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration12.setwindowDecorated(false);
        int int15 = lwjgl3ApplicationConfiguration12.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration12.setwindowX(20188);
        lwjgl3ApplicationConfiguration12.setvSyncEnabled(false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test21822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21822");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode11 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color((-15144960));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color19 = color13.add(8.908043E-39f, 0.87058824f, 0.0f, (float) 17992800);
        com.badlogic.gdx.graphics.Color color21 = color19.mul((float) (-103936));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(lwjgl3DisplayMode11);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test21823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21823");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.setgles30ContextMinorVersion(65025);
        lwjgl3ApplicationConfiguration16.initialVisible = true;
        int int21 = lwjgl3ApplicationConfiguration16.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Files.FileType fileType26 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration23.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ff660000", fileType26);
        int int29 = lwjgl3ApplicationConfiguration16.samples;
        int int30 = lwjgl3ApplicationConfiguration16.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = lwjgl3ApplicationConfiguration16.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration32.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration32.windowX = 100;
        boolean boolean37 = lwjgl3ApplicationConfiguration32.getdisableAudio();
        boolean boolean38 = lwjgl3ApplicationConfiguration32.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = lwjgl3ApplicationConfiguration32.hdpiMode;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertNull(lwjgl3WindowListener31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21824");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-5.915194E37f), (float) (-248), (-1.4523669E17f), (float) (-33488896));
    }

    @Test
    public void test21825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21825");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color7 = color2.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color8 = color1.sub(color7);
        com.badlogic.gdx.graphics.Color color9 = new com.badlogic.gdx.graphics.Color(color1);
        int int10 = color9.toIntBits();
        color9.a = 8;
        int int13 = com.badlogic.gdx.graphics.Color.argb8888(color9);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-134217728) + "'", int13 == (-134217728));
    }

    @Test
    public void test21826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21826");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        int int10 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int11 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setDecorated(false);
        lwjgl3ApplicationConfiguration13.a = (byte) 10;
        boolean boolean18 = lwjgl3ApplicationConfiguration13.initialVisible;
        int int19 = lwjgl3ApplicationConfiguration13.b;
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        lwjgl3ApplicationConfiguration13.windowResizable = false;
        lwjgl3ApplicationConfiguration13.gles30ContextMajorVersion = 14;
        lwjgl3ApplicationConfiguration13.preferencesDirectory = "00ffff00";
        boolean boolean28 = lwjgl3ApplicationConfiguration13.getdisableAudio();
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration13.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00000e00", fileType29);
        int int31 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test21827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21827");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(570425395);
        com.badlogic.gdx.graphics.Color color2 = new com.badlogic.gdx.graphics.Color(color1);
        color1.g = (-10887648);
    }

    @Test
    public void test21828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21828");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-270598144);
        lwjgl3ApplicationConfiguration0.windowHeight = (-232);
        lwjgl3ApplicationConfiguration0.r = (-8672);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-938016));
        int int18 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-232) + "'", int18 == (-232));
    }

    @Test
    public void test21829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21829");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.depth = (-537010176);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-50396672), (int) '#');
        lwjgl3ApplicationConfiguration0.setwindowX((-393464));
        com.badlogic.gdx.graphics.Color color19 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test21830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21830");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43268 + "'", int17 == 43268);
    }

    @Test
    public void test21831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21831");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = ' ';
        java.lang.String str3 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-2143297280);
        lwjgl3ApplicationConfiguration0.stencil = (-940);
        int int10 = lwjgl3ApplicationConfiguration0.windowX;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        int int13 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test21832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21832");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-536674832));
    }

    @Test
    public void test21833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21833");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        int int10 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration0.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = lwjgl3ApplicationConfiguration0.windowListener;
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        int int20 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1268));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test21834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21834");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (-1), (-270598144));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        int int16 = lwjgl3ApplicationConfiguration10.audioDeviceBufferCount;
        int int17 = lwjgl3ApplicationConfiguration10.a;
        boolean boolean18 = lwjgl3ApplicationConfiguration10.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode19;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.stencil = (-2142638528);
        lwjgl3ApplicationConfiguration0.setwindowY(1105199359);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-471488);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        int int34 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.g = 16444695;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 480 + "'", int34 == 480);
    }

    @Test
    public void test21835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21835");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.windowWidth = 65522;
        lwjgl3ApplicationConfiguration0.b = 11280416;
        lwjgl3ApplicationConfiguration0.windowWidth = (-65400);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(0);
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-1308622670));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("", fileType30);
        lwjgl3ApplicationConfiguration24.g = (short) 0;
        lwjgl3ApplicationConfiguration24.windowX = 35;
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, 56864, 151015132);
        int int40 = lwjgl3ApplicationConfiguration24.windowY;
        int int41 = lwjgl3ApplicationConfiguration24.getaudioDeviceBufferCount();
        int int42 = lwjgl3ApplicationConfiguration24.g;
        lwjgl3ApplicationConfiguration24.title = "0000f600";
        com.badlogic.gdx.Files.FileType fileType45 = lwjgl3ApplicationConfiguration24.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color((-8414));
        int int48 = com.badlogic.gdx.graphics.Color.argb8888(color47);
        lwjgl3ApplicationConfiguration24.initialBackgroundColor = color47;
        com.badlogic.gdx.graphics.Color color54 = new com.badlogic.gdx.graphics.Color((float) (-135823360), (float) 1557110528, (float) 167247232, (float) (-2));
        float float55 = color54.b;
        color54.a = (-2117009408);
        com.badlogic.gdx.graphics.Color color58 = color47.mul(color54);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color47);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(lwjgl3WindowListener21);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(fileType45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 587202527 + "'", int48 == 587202527);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
        org.junit.Assert.assertNotNull(color58);
    }

    @Test
    public void test21836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21836");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        com.badlogic.gdx.graphics.Color color15 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        boolean boolean18 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-2147222656));
        lwjgl3ApplicationConfiguration0.windowY = (-2142638528);
        boolean boolean23 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test21837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21837");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setWindowedMode(640, 65293);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1878880718);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test21838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21838");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 1, (float) (-10887648), (float) (byte) 10, (-1.4936944E38f));
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
        float float6 = color5.g;
        com.badlogic.gdx.graphics.Color color8 = color5.mul((float) (-34));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color8, (-148496));
        int int11 = com.badlogic.gdx.graphics.Color.rgba4444(color8);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46960 + "'", int11 == 46960);
    }

    @Test
    public void test21839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21839");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        int int9 = lwjgl3ApplicationConfiguration7.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration7.setwindowX((-14513374));
        lwjgl3ApplicationConfiguration7.preferencesDirectory = "ff660000";
        lwjgl3ApplicationConfiguration7.preferencesDirectory = "0000ffff";
        lwjgl3ApplicationConfiguration7.r = (-13599584);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test21840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21840");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getuseGL30();
        lwjgl3ApplicationConfiguration0.windowWidth = (-65025);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setDecorated(false);
        lwjgl3ApplicationConfiguration11.a = (byte) 10;
        boolean boolean16 = lwjgl3ApplicationConfiguration11.initialVisible;
        int int17 = lwjgl3ApplicationConfiguration11.b;
        lwjgl3ApplicationConfiguration11.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color20 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration11.initialBackgroundColor = color20;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int23 = lwjgl3ApplicationConfiguration22.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration22.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration22.preferencesFileType;
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode29);
        lwjgl3ApplicationConfiguration28.windowX = 100;
        int int33 = lwjgl3ApplicationConfiguration28.g;
        int int34 = lwjgl3ApplicationConfiguration28.getwindowY();
        com.badlogic.gdx.Files.FileType fileType35 = lwjgl3ApplicationConfiguration28.getpreferencesFileType();
        lwjgl3ApplicationConfiguration11.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType35;
        lwjgl3ApplicationConfiguration0.samples = (-222);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode40 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-32768));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(65296);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.graphics.Color color49 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + fileType35 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType35.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode40 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode40.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test21841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21841");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 512);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-59160), (-1562574848));
        lwjgl3ApplicationConfiguration0.windowX = 587162524;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean17 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.windowHeight = (-17694960);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-14513374));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test21842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21842");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color1 = color0.cpy();
        int int2 = com.badlogic.gdx.graphics.Color.argb8888(color1);
        com.badlogic.gdx.graphics.Color color7 = color1.set((float) (-1562574848), (float) 369623040, (-6.9082207E37f), (float) 61200);
        int int8 = com.badlogic.gdx.graphics.Color.rgba8888(color1);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16737792 + "'", int2 == 16737792);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16711935 + "'", int8 == 16711935);
    }

    @Test
    public void test21843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21843");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        java.lang.String str6 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        lwjgl3ApplicationConfiguration0.setwindowX(16776961);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.windowY = 166464502;
        lwjgl3ApplicationConfiguration13.disableAudio(false);
        java.lang.String str18 = lwjgl3ApplicationConfiguration13.preferencesDirectory;
        int int19 = lwjgl3ApplicationConfiguration13.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".prefs/" + "'", str6, ".prefs/");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test21844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21844");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.0f, (float) 1, 0.13333334f, 1.561203E-39f);
        com.badlogic.gdx.graphics.Color color6 = color4.mul((float) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.useVsync(false);
        lwjgl3ApplicationConfiguration7.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration7.a = (-62986);
        lwjgl3ApplicationConfiguration7.setdisableAudio(true);
        boolean boolean19 = lwjgl3ApplicationConfiguration7.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration21.windowX = 100;
        int int26 = lwjgl3ApplicationConfiguration21.g;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration21.getpreferencesFileType();
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("ffffff00", fileType27);
        int int29 = lwjgl3ApplicationConfiguration7.b;
        boolean boolean30 = lwjgl3ApplicationConfiguration7.getwindowResizable();
        int int31 = lwjgl3ApplicationConfiguration7.getsamples();
        com.badlogic.gdx.graphics.Color color33 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color34 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color39 = color34.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color40 = color33.sub(color39);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color33, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color33);
        com.badlogic.gdx.graphics.Color color44 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color color46 = color44.mul((float) (-14513374));
        com.badlogic.gdx.graphics.Color color47 = color43.set(color44);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color43, 0);
        com.badlogic.gdx.graphics.Color color54 = color43.sub((-1.7005551E38f), (float) 1044480, 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color55 = new com.badlogic.gdx.graphics.Color(color43);
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color55;
        float float57 = color55.g;
        com.badlogic.gdx.graphics.Color color59 = color55.mul((float) (-11280864));
        com.badlogic.gdx.graphics.Color color64 = color59.set((float) 16735984, (float) 16771591, (-4.1619106E19f), (float) (-18432));
        com.badlogic.gdx.graphics.Color color66 = color6.lerp(color64, (float) (-12775665));
        color66.g = 0.06666667f;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color66);
    }

    @Test
    public void test21845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21845");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.setwindowY(0);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-53760);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test21846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21846");
        com.badlogic.gdx.graphics.Color color0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.graphics.Color.argb8888ToColor(color0, 2147483498);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21847");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.627451f, (float) (-214200), (float) (-1291845633), (float) (-537010176));
    }

    @Test
    public void test21848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21848");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SCARLET;
        color31.b = '#';
        com.badlogic.gdx.graphics.Color color34 = color9.add(color31);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (-469444608));
        com.badlogic.gdx.graphics.Color color38 = color34.mul(0.0f);
        com.badlogic.gdx.graphics.Color color39 = new com.badlogic.gdx.graphics.Color(color34);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test21849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21849");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-2147438080));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setDecorated(false);
        lwjgl3ApplicationConfiguration6.a = (byte) 10;
        boolean boolean11 = lwjgl3ApplicationConfiguration6.initialVisible;
        int int12 = lwjgl3ApplicationConfiguration6.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration6.windowListener;
        lwjgl3ApplicationConfiguration6.setvSyncEnabled(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        lwjgl3ApplicationConfiguration16.setsamples((int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration24.setpreferencesFileType(fileType25);
        lwjgl3ApplicationConfiguration24.useVsync(false);
        lwjgl3ApplicationConfiguration24.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration24.a = (-62986);
        lwjgl3ApplicationConfiguration24.setdisableAudio(true);
        boolean boolean36 = lwjgl3ApplicationConfiguration24.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration38.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration38.windowX = 100;
        int int43 = lwjgl3ApplicationConfiguration38.g;
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration38.getpreferencesFileType();
        lwjgl3ApplicationConfiguration24.setPreferencesConfig("ffffff00", fileType44);
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ffff72ff", fileType44);
        lwjgl3ApplicationConfiguration6.setpreferencesFileType(fileType44);
        com.badlogic.gdx.Files.FileType fileType48 = lwjgl3ApplicationConfiguration6.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(99, (-15859955), (-16842496));
        lwjgl3ApplicationConfiguration0.depth = (-1581104);
        lwjgl3ApplicationConfiguration0.setsamples((-10551290));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType48 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType48.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration50);
    }

    @Test
    public void test21850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21850");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = 167247232;
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration0.windowX = 254;
        int int22 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43268 + "'", int22 == 43268);
    }

    @Test
    public void test21851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21851");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(56864);
        lwjgl3ApplicationConfiguration0.stencil = (-12583168);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test21852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21852");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 100;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.a = (-1912602624);
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test21853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21853");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration16);
        java.lang.String str18 = lwjgl3ApplicationConfiguration16.title;
        lwjgl3ApplicationConfiguration16.audioDeviceBufferCount = 16;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration16.setWindowListener(lwjgl3WindowListener21);
        int int23 = lwjgl3ApplicationConfiguration16.getwindowHeight();
        lwjgl3ApplicationConfiguration16.setaudioDeviceSimultaneousSources(234815743);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 480 + "'", int23 == 480);
    }

    @Test
    public void test21854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21854");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        int int9 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration10.samples = '4';
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration10.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType15;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 14500320;
        com.badlogic.gdx.Files.FileType fileType21 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int22 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType21 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType21.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14500320 + "'", int22 == 14500320);
    }

    @Test
    public void test21855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21855");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.depth = 63519;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-22));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration13.setwindowResizable(false);
        lwjgl3ApplicationConfiguration13.setwindowDecorated(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test21856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21856");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        lwjgl3ApplicationConfiguration0.title = "4169e1ff";
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color16 = color10.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color17 = color8.mul(color16);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color8, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color8;
        int int21 = com.badlogic.gdx.graphics.Color.argb8888(color8);
        com.badlogic.gdx.graphics.Color color23 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = color23.mul(color31);
        com.badlogic.gdx.graphics.Color color34 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        float float35 = color34.a;
        com.badlogic.gdx.graphics.Color color40 = color34.mul((float) 8, (float) 1677696502, (float) 0L, (float) 43268);
        com.badlogic.gdx.graphics.Color color41 = color23.add(color40);
        com.badlogic.gdx.graphics.Color color46 = color41.mul(0.0f, (float) '#', 0.0f, (float) 16711935);
        color41.r = (-652800);
        com.badlogic.gdx.graphics.Color color50 = color41.mul((float) (-1313754704));
        com.badlogic.gdx.graphics.Color color51 = new com.badlogic.gdx.graphics.Color(color41);
        com.badlogic.gdx.graphics.Color color53 = color8.lerp(color41, (-1.6012534E38f));
        com.badlogic.gdx.graphics.Color color54 = com.badlogic.gdx.graphics.Color.GREEN;
        com.badlogic.gdx.graphics.Color color60 = color54.lerp((-4.581683E37f), (float) 20160, (float) 13260, (float) (-187392), (float) (-1879860224));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color60, (-27809536));
        com.badlogic.gdx.graphics.Color color64 = color60.mul((float) 1794115036);
        com.badlogic.gdx.graphics.Color color65 = color53.add(color64);
        color64.g = (-1.6964021E38f);
        int int68 = com.badlogic.gdx.graphics.Color.rgba8888(color64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(color54);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-16776961) + "'", int68 == (-16776961));
    }

    @Test
    public void test21857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21857");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(1694498815, (-554880), (-1286766592), 16668585);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test21858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21858");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color3 = color0.set(35);
        com.badlogic.gdx.graphics.Color color4 = color0.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color9 = color0.mul(0.0f, (float) 65535, (float) (-32), (float) (-1));
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color21 = new com.badlogic.gdx.graphics.Color(color11);
        com.badlogic.gdx.graphics.Color color26 = color11.mul((float) (-222), (-1.5084639E38f), (float) (-62986), (float) (-16741598));
        float float27 = color26.r;
        com.badlogic.gdx.graphics.Color color28 = color26.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color30 = color9.lerp(color26, (float) 16580354);
        com.badlogic.gdx.graphics.Color color31 = com.badlogic.gdx.graphics.Color.SCARLET;
        color31.b = '#';
        com.badlogic.gdx.graphics.Color color34 = color9.add(color31);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color34, (-469444608));
        float float37 = color34.a;
        com.badlogic.gdx.graphics.Color color39 = color34.set((-2208384));
        com.badlogic.gdx.graphics.Color color40 = color39.clamp();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test21859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21859");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.setWindowPosition(130560, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.title = "ffffffb6";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration16.windowX = 100;
        int int21 = lwjgl3ApplicationConfiguration16.g;
        java.lang.String str22 = lwjgl3ApplicationConfiguration16.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration16.setwindowResizable(false);
        int int25 = lwjgl3ApplicationConfiguration16.samples;
        lwjgl3ApplicationConfiguration16.setpreferencesDirectory("ff660000");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration29.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration29.windowX = 100;
        int int34 = lwjgl3ApplicationConfiguration29.stencil;
        int int35 = lwjgl3ApplicationConfiguration29.windowY;
        lwjgl3ApplicationConfiguration29.a = 43268;
        int int38 = lwjgl3ApplicationConfiguration29.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType39 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("ffff65b6", fileType39);
        boolean boolean41 = lwjgl3ApplicationConfiguration16.getdisableAudio();
        int int42 = lwjgl3ApplicationConfiguration16.getwindowY();
        com.badlogic.gdx.Files.FileType fileType43 = lwjgl3ApplicationConfiguration16.getpreferencesFileType();
        com.badlogic.gdx.graphics.Color color48 = new com.badlogic.gdx.graphics.Color((float) 6147990, (float) (byte) -1, (float) (-61455), (float) 15687677);
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration50.setpreferencesFileType(fileType51);
        lwjgl3ApplicationConfiguration50.disableAudio = true;
        int int55 = lwjgl3ApplicationConfiguration50.windowY;
        int int56 = lwjgl3ApplicationConfiguration50.audioDeviceBufferCount;
        int int57 = lwjgl3ApplicationConfiguration50.a;
        boolean boolean58 = lwjgl3ApplicationConfiguration50.getvSyncEnabled();
        lwjgl3ApplicationConfiguration50.windowHeight = 'a';
        com.badlogic.gdx.Graphics.DisplayMode displayMode61 = null;
        lwjgl3ApplicationConfiguration50.setFullscreenMode(displayMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration63 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType64 = null;
        lwjgl3ApplicationConfiguration63.setpreferencesFileType(fileType64);
        lwjgl3ApplicationConfiguration63.setsamples((int) (short) 0);
        int int68 = lwjgl3ApplicationConfiguration63.getgles30ContextMinorVersion();
        int int69 = lwjgl3ApplicationConfiguration63.g;
        lwjgl3ApplicationConfiguration63.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = lwjgl3ApplicationConfiguration63.hdpiMode;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode72);
        int int76 = lwjgl3ApplicationConfiguration0.getsamples();
        boolean boolean77 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".prefs/" + "'", str22, ".prefs/");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + fileType39 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType39.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + fileType43 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType43.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 8 + "'", int57 == 8);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 8 + "'", int69 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test21860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21860");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        int int5 = lwjgl3ApplicationConfiguration0.windowX;
        boolean boolean6 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        int int7 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType9);
        lwjgl3ApplicationConfiguration8.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration8.g = (short) 0;
        lwjgl3ApplicationConfiguration8.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.a = (byte) 10;
        boolean boolean25 = lwjgl3ApplicationConfiguration20.initialVisible;
        int int26 = lwjgl3ApplicationConfiguration20.b;
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType29 = lwjgl3ApplicationConfiguration20.preferencesFileType;
        lwjgl3ApplicationConfiguration8.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType29);
        int int32 = lwjgl3ApplicationConfiguration0.windowY;
        int int33 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean34 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test21861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21861");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-41231), 0.0f, (float) 93, (float) (-36356880));
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color4, (-26));
    }

    @Test
    public void test21862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21862");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(0.19607843f, 9.1477E-41f, (float) 512, (float) 20188);
        int int5 = color4.toIntBits();
        int int6 = com.badlogic.gdx.graphics.Color.argb8888(color4);
        com.badlogic.gdx.graphics.Color color11 = color4.set((float) (-2145394688), (-1.6978602E38f), (float) (-327680), (float) (-10249181));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color11, 285736960);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-65486) + "'", int5 == (-65486));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-13500161) + "'", int6 == (-13500161));
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test21863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21863");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        int int10 = lwjgl3ApplicationConfiguration0.getwindowX();
        com.badlogic.gdx.graphics.Color color11 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int12 = lwjgl3ApplicationConfiguration0.windowWidth;
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.b = 587202527;
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 640 + "'", int12 == 640);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".prefs/" + "'", str13, ".prefs/");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
    }

    @Test
    public void test21864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21864");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        boolean boolean14 = lwjgl3ApplicationConfiguration0.windowDecorated;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.useGL30;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test21865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21865");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.b = 16711425;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        int int13 = lwjgl3ApplicationConfiguration0.samples;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test21866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21866");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        lwjgl3ApplicationConfiguration0.windowY = (-50135050);
        int int20 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener23;
        int int25 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration27.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration27.disableAudio = true;
        int int32 = lwjgl3ApplicationConfiguration27.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode33 = lwjgl3ApplicationConfiguration27.fullscreenMode;
        lwjgl3ApplicationConfiguration27.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration27.setwindowY((int) '#');
        int int38 = lwjgl3ApplicationConfiguration27.g;
        int int39 = lwjgl3ApplicationConfiguration27.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration27);
        lwjgl3ApplicationConfiguration27.setsamples((-2147438080));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode43 = lwjgl3ApplicationConfiguration27.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration27.hdpiMode;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration40);
        org.junit.Assert.assertTrue("'" + hdpiMode43 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode43.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21867");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean6 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowDecorated(true);
        lwjgl3ApplicationConfiguration7.setvSyncEnabled(false);
        int int12 = lwjgl3ApplicationConfiguration7.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration13.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21868");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setdepth((-49400));
        int int15 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.setwindowY((-15925492));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-49400) + "'", int15 == (-49400));
    }

    @Test
    public void test21869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21869");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (-1056), 1664640000);
        int int17 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("00ff00dc", fileType19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test21870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21870");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType11 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("hi!", fileType11);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode17;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        boolean boolean21 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-16768992), (-65280));
        boolean boolean26 = lwjgl3ApplicationConfiguration0.disableAudio;
        boolean boolean27 = lwjgl3ApplicationConfiguration0.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType11 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType11.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21871");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType13 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode16);
        lwjgl3ApplicationConfiguration15.windowX = 100;
        int int20 = lwjgl3ApplicationConfiguration15.stencil;
        int int21 = lwjgl3ApplicationConfiguration15.windowY;
        lwjgl3ApplicationConfiguration15.a = 43268;
        int int24 = lwjgl3ApplicationConfiguration15.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        boolean boolean26 = lwjgl3ApplicationConfiguration15.initialVisible;
        com.badlogic.gdx.Files.FileType fileType27 = lwjgl3ApplicationConfiguration15.preferencesFileType;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType27;
        int int29 = lwjgl3ApplicationConfiguration0.stencil;
        lwjgl3ApplicationConfiguration0.samples = (-26);
        org.junit.Assert.assertTrue("'" + fileType13 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType13.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + fileType27 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType27.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-62986) + "'", int29 == (-62986));
    }

    @Test
    public void test21872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21872");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.2790363E-19f), (-1.6947138E38f), (float) (-503316480), (float) (-65568));
    }

    @Test
    public void test21873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21873");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int11 = lwjgl3ApplicationConfiguration10.b;
        lwjgl3ApplicationConfiguration10.audioDeviceBufferCount = 491322945;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20188 + "'", int9 == 20188);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test21874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21874");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration10.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.stencil = 64186;
        lwjgl3ApplicationConfiguration10.vSyncEnabled = false;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
    }

    @Test
    public void test21875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21875");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType4 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.disableAudio;
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-1800));
        boolean boolean8 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration9.setpreferencesFileType(fileType10);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        int int14 = lwjgl3ApplicationConfiguration9.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode15 = lwjgl3ApplicationConfiguration9.fullscreenMode;
        lwjgl3ApplicationConfiguration9.r = 20188;
        boolean boolean18 = lwjgl3ApplicationConfiguration9.initialVisible;
        lwjgl3ApplicationConfiguration9.setdepth((-222));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str22 = lwjgl3ApplicationConfiguration21.title;
        lwjgl3ApplicationConfiguration21.a = (-1);
        boolean boolean25 = lwjgl3ApplicationConfiguration21.vSyncEnabled;
        lwjgl3ApplicationConfiguration21.setaudioDeviceSimultaneousSources((-262646));
        com.badlogic.gdx.graphics.Color color28 = lwjgl3ApplicationConfiguration21.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color29 = new com.badlogic.gdx.graphics.Color(color28);
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(color29);
        com.badlogic.gdx.graphics.Color color35 = color29.sub((float) 3306396, (float) 14500320, (float) 13260, 1.5612034E-37f);
        com.badlogic.gdx.graphics.Color color36 = color35.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color38 = color36.mul((float) 1794115036);
        lwjgl3ApplicationConfiguration9.initialBackgroundColor = color36;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.a = (byte) 10;
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((int) (short) 100, 480, (int) '#', (int) 'a', 1677696502, (int) '#', (int) (short) 0);
        int int54 = lwjgl3ApplicationConfiguration41.audioDeviceBufferSize;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode57 = null;
        lwjgl3ApplicationConfiguration56.setFullscreenMode(displayMode57);
        com.badlogic.gdx.Files.FileType fileType59 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration56.setpreferencesFileType(fileType59);
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType59);
        lwjgl3ApplicationConfiguration9.setPreferencesConfig("ffffff00", fileType59);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType59);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + fileType4 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType4.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 512 + "'", int54 == 512);
        org.junit.Assert.assertTrue("'" + fileType59 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType59.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21876");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 491322945);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test21877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21877");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setwindowWidth((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode6 = null;
        lwjgl3ApplicationConfiguration5.setFullscreenMode(displayMode6);
        lwjgl3ApplicationConfiguration5.samples = (-1);
        lwjgl3ApplicationConfiguration5.useGL30 = true;
        lwjgl3ApplicationConfiguration5.setpreferencesDirectory("ffff72ff");
        int int14 = lwjgl3ApplicationConfiguration5.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration5.windowY = 20188;
        int int17 = lwjgl3ApplicationConfiguration5.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = lwjgl3ApplicationConfiguration5.hdpiMode;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode18;
        int int20 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.a = 255;
        lwjgl3ApplicationConfiguration0.windowWidth = (-1628563456);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test21878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21878");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-152494080), (float) (-1359675392), (float) (-326400), (float) 1610620896);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test21879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21879");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = lwjgl3ApplicationConfiguration0.windowListener;
        boolean boolean7 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int10 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration11.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration11.windowX = 100;
        int int16 = lwjgl3ApplicationConfiguration11.stencil;
        int int17 = lwjgl3ApplicationConfiguration11.windowY;
        lwjgl3ApplicationConfiguration11.a = 43268;
        int int20 = lwjgl3ApplicationConfiguration11.gles30ContextMinorVersion;
        int int21 = lwjgl3ApplicationConfiguration11.b;
        com.badlogic.gdx.graphics.Color color22 = lwjgl3ApplicationConfiguration11.initialBackgroundColor;
        int int23 = lwjgl3ApplicationConfiguration11.getgles30ContextMinorVersion();
        int int24 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferCount();
        int int25 = lwjgl3ApplicationConfiguration11.samples;
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration11.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration0.setwindowX((-36608));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(lwjgl3WindowListener6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21880");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        boolean boolean14 = lwjgl3ApplicationConfiguration13.windowResizable;
        boolean boolean15 = lwjgl3ApplicationConfiguration13.getuseGL30();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration13.fullscreenMode;
        boolean boolean17 = lwjgl3ApplicationConfiguration13.getwindowResizable();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color21 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color22 = color20.set(color21);
        float float23 = color21.b;
        float float24 = color21.r;
        com.badlogic.gdx.graphics.Color color29 = color21.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color30 = color21.cpy();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration31.samples = (-1);
        boolean boolean36 = lwjgl3ApplicationConfiguration31.initialVisible;
        com.badlogic.gdx.graphics.Color color37 = com.badlogic.gdx.graphics.Color.BLACK;
        float float38 = color37.r;
        com.badlogic.gdx.graphics.Color color43 = color37.set((float) 0L, (float) 1671296512, (float) 255, (-5.387877E37f));
        lwjgl3ApplicationConfiguration31.initialBackgroundColor = color37;
        com.badlogic.gdx.graphics.Color color45 = color37.cpy();
        com.badlogic.gdx.graphics.Color color46 = new com.badlogic.gdx.graphics.Color(color45);
        com.badlogic.gdx.graphics.Color color47 = color30.mul(color46);
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color47);
        float float49 = color47.toFloatBits();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 9.1477E-41f + "'", float49 == 9.1477E-41f);
    }

    @Test
    public void test21881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21881");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration8.setpreferencesDirectory("f3c766e0");
        boolean boolean11 = lwjgl3ApplicationConfiguration8.windowResizable;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test21882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21882");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888(0.19607843f, (float) (-304320), (float) (-11777024), (float) (-1081344));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3112960) + "'", int4 == (-3112960));
    }

    @Test
    public void test21883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21883");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.g = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode8 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode8;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        int int12 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        int int13 = lwjgl3ApplicationConfiguration0.g;
        lwjgl3ApplicationConfiguration0.setsamples(1500);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType18 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + fileType18 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType18.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21884");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-22));
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        boolean boolean18 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        boolean boolean19 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str21 = lwjgl3ApplicationConfiguration20.title;
        com.badlogic.gdx.graphics.Color color22 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color22, 16);
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color22);
        com.badlogic.gdx.graphics.Color color30 = color22.sub((float) (-232), (float) (-255), (float) 10L, (float) 1L);
        com.badlogic.gdx.graphics.Color color32 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color38 = color32.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color39 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str40 = color39.toString();
        com.badlogic.gdx.graphics.Color color42 = color32.lerp(color39, (-8.0750596E37f));
        com.badlogic.gdx.graphics.Color color43 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color43, 16);
        com.badlogic.gdx.graphics.Color color46 = color42.sub(color43);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color43, 1677696502);
        com.badlogic.gdx.graphics.Color color49 = color22.sub(color43);
        com.badlogic.gdx.graphics.Color color51 = color43.mul((float) 14500320);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration52.setpreferencesFileType(fileType53);
        lwjgl3ApplicationConfiguration52.useVsync(false);
        lwjgl3ApplicationConfiguration52.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration52);
        boolean boolean60 = lwjgl3ApplicationConfiguration52.windowDecorated;
        lwjgl3ApplicationConfiguration52.useVsync(false);
        lwjgl3ApplicationConfiguration52.windowWidth = 65522;
        lwjgl3ApplicationConfiguration52.b = 11280416;
        lwjgl3ApplicationConfiguration52.windowWidth = (-65400);
        com.badlogic.gdx.graphics.Color color69 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color74 = color69.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        float float75 = color69.r;
        lwjgl3ApplicationConfiguration52.initialBackgroundColor = color69;
        com.badlogic.gdx.graphics.Color color77 = color43.set(color69);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.setwindowResizable(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "00ff0000" + "'", str40, "00ff0000");
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertNotNull(color77);
    }

    @Test
    public void test21885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21885");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        lwjgl3ApplicationConfiguration9.disableAudio = true;
        lwjgl3ApplicationConfiguration9.setwindowResizable(true);
        int int14 = lwjgl3ApplicationConfiguration9.a;
        boolean boolean15 = lwjgl3ApplicationConfiguration9.windowResizable;
        int int16 = lwjgl3ApplicationConfiguration9.gles30ContextMajorVersion;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test21886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21886");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16777198, (float) (-8672), (float) (-7688), (float) 1932040192);
        float float5 = color4.a;
        color4.g = (-471488);
        com.badlogic.gdx.graphics.Color color13 = color4.lerp((float) (-185205247), (float) (-10555392), 0.93333334f, (float) 62976, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color4.set((float) (-7905), (-1.7011522E38f), (float) (-1130590), (float) (-24103296));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test21887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21887");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(80, 16, 4030, (-48));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-541192112) + "'", int4 == (-541192112));
    }

    @Test
    public void test21888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21888");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-9216), (float) (-1575957248), 0.0f, (float) 16776994);
        color4.a = 4.3190737E-19f;
    }

    @Test
    public void test21889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21889");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        boolean boolean6 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int7 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-222));
        lwjgl3ApplicationConfiguration0.setwindowY(58111);
        int int15 = lwjgl3ApplicationConfiguration0.getwindowX();
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-403734016);
        lwjgl3ApplicationConfiguration0.b = 63503;
        int int20 = lwjgl3ApplicationConfiguration0.getdepth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 480 + "'", int7 == 480);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".prefs/" + "'", str8, ".prefs/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test21890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21890");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources((-262646));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (-256), (-1306385665), (-1879860224), 43268, 512, (-1611265692));
        int int17 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color18 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffffa400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration22.setpreferencesFileType(fileType23);
        lwjgl3ApplicationConfiguration22.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration22.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration22.g = (short) 0;
        lwjgl3ApplicationConfiguration22.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = lwjgl3ApplicationConfiguration22.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode36 = null;
        lwjgl3ApplicationConfiguration35.setFullscreenMode(displayMode36);
        lwjgl3ApplicationConfiguration35.windowX = 100;
        lwjgl3ApplicationConfiguration35.windowResizable = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int44 = lwjgl3ApplicationConfiguration43.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration43.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType47 = lwjgl3ApplicationConfiguration43.preferencesFileType;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("ffff00ff", fileType47);
        lwjgl3ApplicationConfiguration22.preferencesFileType = fileType47;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ff228b22", fileType47);
        lwjgl3ApplicationConfiguration0.samples = 195840;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43268 + "'", int17 == 43268);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 512 + "'", int44 == 512);
        org.junit.Assert.assertTrue("'" + fileType47 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType47.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21891");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        int int19 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.setsamples(512);
        boolean boolean22 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setsamples((-13500161));
        lwjgl3ApplicationConfiguration0.setAudioConfig((-14737236), 0, 1310240);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test21892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21892");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color12 = color7.lerp(color10, (float) (short) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        int int14 = lwjgl3ApplicationConfiguration0.r;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowX = (-1620988928);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
    }

    @Test
    public void test21893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21893");
        int int4 = com.badlogic.gdx.graphics.Color.rgba8888((float) (-16777038), (-1.7013601E38f), (float) (-532099584), (float) (-33463396));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
    }

    @Test
    public void test21894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21894");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (-524869), 587162524);
        com.badlogic.gdx.graphics.Color color11 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color11, (int) 'a');
        com.badlogic.gdx.graphics.Color color14 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color16 = color11.lerp(color14, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color17 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str18 = color17.toString();
        com.badlogic.gdx.graphics.Color color19 = color14.sub(color17);
        com.badlogic.gdx.graphics.Color color20 = new com.badlogic.gdx.graphics.Color(color19);
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color19, (-1880097264));
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.graphics.Color color28 = new com.badlogic.gdx.graphics.Color((float) 573767680, (float) 284196832, (-1.7013883E38f), (float) (-56576));
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(480);
        com.badlogic.gdx.graphics.Color color31 = color30.cpy();
        com.badlogic.gdx.graphics.Color color32 = color28.mul(color30);
        com.badlogic.gdx.graphics.Color color34 = color19.lerp(color28, (float) (-15671025));
        com.badlogic.gdx.graphics.Color color40 = color34.lerp((float) (-677216256), (float) (-14671700), (float) (-50331648), (float) 4275200, (float) (-20));
        com.badlogic.gdx.graphics.Color color41 = new com.badlogic.gdx.graphics.Color(color34);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00ff0000" + "'", str18, "00ff0000");
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test21895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21895");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-15667200);
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        int int19 = lwjgl3ApplicationConfiguration0.g;
        int int20 = lwjgl3ApplicationConfiguration0.audioDeviceBufferSize;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-62986) + "'", int18 == (-62986));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test21896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21896");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = (-33488131);
        lwjgl3ApplicationConfiguration0.setwindowX((-16734721));
        int int11 = lwjgl3ApplicationConfiguration0.getdepth();
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        com.badlogic.gdx.Files.FileType fileType15 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setdepth((-15860224));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
        org.junit.Assert.assertTrue("'" + fileType15 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType15.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21897");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.g = 31334400;
        lwjgl3ApplicationConfiguration0.setwindowX(570949632);
        lwjgl3ApplicationConfiguration0.windowY = (-2147477600);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration11.setpreferencesFileType(fileType12);
        lwjgl3ApplicationConfiguration11.disableAudio = true;
        int int16 = lwjgl3ApplicationConfiguration11.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode17 = lwjgl3ApplicationConfiguration11.fullscreenMode;
        lwjgl3ApplicationConfiguration11.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration11.setwindowY((int) '#');
        int int22 = lwjgl3ApplicationConfiguration11.g;
        int int23 = lwjgl3ApplicationConfiguration11.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration11.b = (short) -1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration11.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration11.setwindowWidth(14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration30.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration30.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration30.gles30ContextMajorVersion = 10;
        lwjgl3ApplicationConfiguration30.gles30ContextMinorVersion = ' ';
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener47 = lwjgl3ApplicationConfiguration30.windowListener;
        int int48 = lwjgl3ApplicationConfiguration30.getdepth();
        com.badlogic.gdx.Files.FileType fileType49 = lwjgl3ApplicationConfiguration30.preferencesFileType;
        lwjgl3ApplicationConfiguration11.preferencesFileType = fileType49;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNull(lwjgl3WindowListener47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 512 + "'", int48 == 512);
        org.junit.Assert.assertTrue("'" + fileType49 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType49.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21898");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration18.b;
        lwjgl3ApplicationConfiguration18.useGL30 = false;
        int int23 = lwjgl3ApplicationConfiguration18.getgles30ContextMinorVersion();
        boolean boolean24 = lwjgl3ApplicationConfiguration18.getwindowDecorated();
        int int25 = lwjgl3ApplicationConfiguration18.getwindowY();
        com.badlogic.gdx.graphics.Color color30 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color30);
        int int32 = lwjgl3ApplicationConfiguration18.a;
        int int33 = lwjgl3ApplicationConfiguration18.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int43 = lwjgl3ApplicationConfiguration34.getwindowHeight();
        boolean boolean44 = lwjgl3ApplicationConfiguration34.useGL30;
        com.badlogic.gdx.Files.FileType fileType45 = lwjgl3ApplicationConfiguration34.getpreferencesFileType();
        lwjgl3ApplicationConfiguration18.preferencesFileType = fileType45;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 480 + "'", int43 == 480);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + fileType45 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType45.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21899");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.depth = (-537010176);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-50396672), (int) '#');
        lwjgl3ApplicationConfiguration0.setwindowX((-393464));
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1109610), 3840);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-2146504448), (-98049536));
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10485760, 519950848);
    }

    @Test
    public void test21900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21900");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 11337472, (float) 50200576, (float) 41903542, (float) (-204539423));
    }

    @Test
    public void test21901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21901");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color13, (int) 'a');
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color18 = color13.lerp(color16, (float) (short) 0);
        com.badlogic.gdx.graphics.Color color19 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str20 = color19.toString();
        com.badlogic.gdx.graphics.Color color21 = color16.sub(color19);
        float float22 = color19.toFloatBits();
        com.badlogic.gdx.graphics.Color color24 = color19.set(32);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color19;
        int int26 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00ff0000" + "'", str20, "00ff0000");
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 9.1477E-41f + "'", float22 == 9.1477E-41f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test21902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21902");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration8.setaudioDeviceBufferCount(20188);
        com.badlogic.gdx.Files.FileType fileType13 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        int int14 = lwjgl3ApplicationConfiguration8.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration8.setgles30ContextMinorVersion((-2147222656));
        int int17 = lwjgl3ApplicationConfiguration8.windowX;
        lwjgl3ApplicationConfiguration8.b = 47;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(fileType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20188 + "'", int14 == 20188);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test21903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21903");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-7688));
        int int2 = color1.toIntBits();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration3 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int4 = lwjgl3ApplicationConfiguration3.getaudioDeviceBufferSize();
        boolean boolean5 = lwjgl3ApplicationConfiguration3.windowResizable;
        lwjgl3ApplicationConfiguration3.disableAudio = false;
        lwjgl3ApplicationConfiguration3.setwindowHeight((int) (byte) 10);
        com.badlogic.gdx.graphics.Color color11 = new com.badlogic.gdx.graphics.Color(0);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color17 = color12.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = color11.sub(color17);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color11, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = color11.set(1.561203E-39f, (float) 2, (float) (byte) -1, (float) 3);
        lwjgl3ApplicationConfiguration3.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration27.samples = '4';
        int int32 = lwjgl3ApplicationConfiguration27.r;
        lwjgl3ApplicationConfiguration27.setwindowY(1671296512);
        lwjgl3ApplicationConfiguration27.setAudioConfig(640, 8897069, (-62986));
        boolean boolean39 = color25.equals((java.lang.Object) (-62986));
        int int40 = com.badlogic.gdx.graphics.Color.rgba8888(color25);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color25, 16252680);
        com.badlogic.gdx.graphics.Color color43 = new com.badlogic.gdx.graphics.Color(color25);
        color43.g = (-1.6947657E38f);
        com.badlogic.gdx.graphics.Color color46 = color1.sub(color43);
        com.badlogic.gdx.graphics.Color color47 = new com.badlogic.gdx.graphics.Color(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-119406593) + "'", int2 == (-119406593));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 16711935 + "'", int40 == 16711935);
        org.junit.Assert.assertNotNull(color46);
    }

    @Test
    public void test21904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21904");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.disableAudio;
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test21905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21905");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.stencil = (-1);
        int int7 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test21906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21906");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        boolean boolean10 = lwjgl3ApplicationConfiguration7.disableAudio;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test21907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21907");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        int int7 = lwjgl3ApplicationConfiguration0.r;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test21908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21908");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType8);
        lwjgl3ApplicationConfiguration7.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration7.g = (short) 0;
        lwjgl3ApplicationConfiguration7.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.a = (byte) 10;
        boolean boolean24 = lwjgl3ApplicationConfiguration19.initialVisible;
        int int25 = lwjgl3ApplicationConfiguration19.b;
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType28 = lwjgl3ApplicationConfiguration19.preferencesFileType;
        lwjgl3ApplicationConfiguration7.setpreferencesFileType(fileType28);
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffffff22", fileType28);
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = 151015132;
        boolean boolean33 = lwjgl3ApplicationConfiguration0.windowDecorated;
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1581148), (-2013528064));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + fileType28 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType28.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test21909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21909");
        int int4 = com.badlogic.gdx.graphics.Color.argb8888((float) (-61200), (float) (-14911125), (float) (-520094721), (float) (-2131293696));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1879048192) + "'", int4 == (-1879048192));
    }

    @Test
    public void test21910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21910");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-786912));
        color1.g = (-284098320);
    }

    @Test
    public void test21911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21911");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = lwjgl3ApplicationConfiguration7.fullscreenMode;
        boolean boolean11 = lwjgl3ApplicationConfiguration7.windowResizable;
        lwjgl3ApplicationConfiguration7.disableAudio = false;
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setpreferencesDirectory("ffff2200");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(lwjgl3DisplayMode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test21912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21912");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 65280, (float) (-85425), (float) 16580354, (float) (-50396672));
        com.badlogic.gdx.graphics.Color color5 = color4.cpy();
        int int6 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16711935 + "'", int6 == 16711935);
    }

    @Test
    public void test21913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21913");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        int int2 = lwjgl3ApplicationConfiguration0.b;
        int int3 = lwjgl3ApplicationConfiguration0.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration4 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str5 = lwjgl3ApplicationConfiguration4.title;
        lwjgl3ApplicationConfiguration4.windowY = 20188;
        lwjgl3ApplicationConfiguration4.setwindowResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.disableAudio = true;
        int int15 = lwjgl3ApplicationConfiguration10.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode16 = lwjgl3ApplicationConfiguration10.fullscreenMode;
        lwjgl3ApplicationConfiguration10.useGL30 = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration19.setwindowX((int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = lwjgl3ApplicationConfiguration19.hdpiMode;
        lwjgl3ApplicationConfiguration10.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration4.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode24;
        lwjgl3ApplicationConfiguration0.stencil = (-16734721);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-563347472));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode16);
        org.junit.Assert.assertTrue("'" + hdpiMode24 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode24.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21914");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-1611265692);
        lwjgl3ApplicationConfiguration0.setdisableAudio(false);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowResizable();
        lwjgl3ApplicationConfiguration0.a = (-2137260032);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21915");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 485486337, (float) 43268, (float) (-115213), (float) 17301504);
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color(color4);
    }

    @Test
    public void test21916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21916");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration7.windowWidth;
        int int12 = lwjgl3ApplicationConfiguration7.getaudioDeviceBufferSize();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 640 + "'", int11 == 640);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test21917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21917");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-3045376);
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertNull(lwjgl3WindowListener9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test21918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21918");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration10.title = "004e4edc";
        com.badlogic.gdx.graphics.Color color16 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        color16.b = (-383778816);
        lwjgl3ApplicationConfiguration10.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration10.setdisableAudio(true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test21919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21919");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setwindowDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-270335746));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration18.setpreferencesFileType(fileType19);
        lwjgl3ApplicationConfiguration18.disableAudio = true;
        lwjgl3ApplicationConfiguration18.initialVisible = true;
        int int25 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration18.b = (-62986);
        lwjgl3ApplicationConfiguration18.b = 2;
        lwjgl3ApplicationConfiguration18.setwindowX((int) 'a');
        int int32 = lwjgl3ApplicationConfiguration18.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int34 = lwjgl3ApplicationConfiguration33.getaudioDeviceBufferSize();
        boolean boolean35 = lwjgl3ApplicationConfiguration33.windowResizable;
        lwjgl3ApplicationConfiguration33.disableAudio = false;
        lwjgl3ApplicationConfiguration33.setwindowHeight((int) (byte) 10);
        int int40 = lwjgl3ApplicationConfiguration33.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration41.setpreferencesFileType(fileType42);
        lwjgl3ApplicationConfiguration41.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType47 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("", fileType47);
        lwjgl3ApplicationConfiguration41.g = (short) 0;
        lwjgl3ApplicationConfiguration41.windowX = 35;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = lwjgl3ApplicationConfiguration41.hdpiMode;
        lwjgl3ApplicationConfiguration33.hdpiMode = hdpiMode53;
        lwjgl3ApplicationConfiguration18.hdpiMode = hdpiMode53;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 512 + "'", int34 == 512);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21920");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color7 = new com.badlogic.gdx.graphics.Color(color6);
        java.lang.String str8 = color6.toString();
        com.badlogic.gdx.graphics.Color color13 = color6.sub((-1.5862616E29f), 0.0f, (float) (-56576), (float) 178);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color6, (-7424));
        com.badlogic.gdx.graphics.Color color16 = color6.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ffffff00" + "'", str8, "ffffff00");
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test21921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21921");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int17 = lwjgl3ApplicationConfiguration0.depth;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test21922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21922");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        int int6 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.windowY = (-1);
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-652800);
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int15 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test21923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21923");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color5 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color6 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color7 = color5.set(color6);
        com.badlogic.gdx.graphics.Color color8 = new com.badlogic.gdx.graphics.Color(color5);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.NAVY;
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color15 = color10.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color10);
        com.badlogic.gdx.graphics.Color color17 = new com.badlogic.gdx.graphics.Color(color16);
        com.badlogic.gdx.graphics.Color color18 = com.badlogic.gdx.graphics.Color.ROYAL;
        com.badlogic.gdx.graphics.Color color23 = color18.set((float) (-1), (float) '#', (float) (short) 0, 0.0f);
        com.badlogic.gdx.graphics.Color color25 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color31 = color25.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color32 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str33 = color32.toString();
        com.badlogic.gdx.graphics.Color color35 = color25.lerp(color32, (-8.0750596E37f));
        boolean boolean36 = color18.equals((java.lang.Object) color25);
        com.badlogic.gdx.graphics.Color color37 = color17.add(color18);
        com.badlogic.gdx.graphics.Color color39 = color9.lerp(color17, (float) (-14540110));
        com.badlogic.gdx.graphics.Color color40 = new com.badlogic.gdx.graphics.Color(color9);
        com.badlogic.gdx.graphics.Color color41 = color5.sub(color9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color51 = lwjgl3ApplicationConfiguration42.initialBackgroundColor;
        com.badlogic.gdx.graphics.Color color52 = color5.sub(color51);
        com.badlogic.gdx.graphics.Color color57 = color5.sub(0.0f, (float) 6147990, (float) 2147483647, 0.0f);
        com.badlogic.gdx.graphics.Color color58 = color5.clamp();
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        int int60 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setwindowY(16580354);
        int int63 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean64 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "00ff0000" + "'", str33, "00ff0000");
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 512 + "'", int60 == 512);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration65);
    }

    @Test
    public void test21924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21924");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener7;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setwindowHeight(250675200);
        java.lang.String str12 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".prefs/" + "'", str12, ".prefs/");
    }

    @Test
    public void test21925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21925");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.setsamples((int) (short) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) 1, (int) 'a', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.r = (short) 10;
        int int15 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.r = 1677696502;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration18.setWindowListener(lwjgl3WindowListener19);
        boolean boolean21 = lwjgl3ApplicationConfiguration18.useGL30;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = lwjgl3ApplicationConfiguration18.windowListener;
        lwjgl3ApplicationConfiguration18.setaudioDeviceSimultaneousSources((-16731648));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(lwjgl3WindowListener22);
    }

    @Test
    public void test21926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21926");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize(652800);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-383778816));
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(246);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test21927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21927");
        int int4 = com.badlogic.gdx.graphics.Color.toIntBits(62730, (-599662592), 864025010, (-1625292800));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101518070) + "'", int4 == (-101518070));
    }

    @Test
    public void test21928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21928");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration7.getpreferencesFileType();
        int int11 = lwjgl3ApplicationConfiguration7.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration7.initialVisible = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration15.setpreferencesFileType(fileType16);
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration22);
        lwjgl3ApplicationConfiguration23.setAudioConfig(512, (-14540110), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        lwjgl3ApplicationConfiguration29.a = (byte) 10;
        boolean boolean34 = lwjgl3ApplicationConfiguration29.initialVisible;
        int int35 = lwjgl3ApplicationConfiguration29.b;
        lwjgl3ApplicationConfiguration29.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType38 = lwjgl3ApplicationConfiguration29.preferencesFileType;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig(".prefs/", fileType38);
        lwjgl3ApplicationConfiguration7.setPreferencesConfig("ffff72ff", fileType38);
        com.badlogic.gdx.graphics.Color color41 = com.badlogic.gdx.graphics.Color.DARK_GRAY;
        float float42 = color41.r;
        lwjgl3ApplicationConfiguration7.initialBackgroundColor = color41;
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color41, 15408630);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNull(fileType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration22);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertTrue("'" + fileType38 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType38.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
    }

    @Test
    public void test21929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21929");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        lwjgl3ApplicationConfiguration0.depth = (-262646);
        lwjgl3ApplicationConfiguration0.setwindowDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration19.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration19.windowX = 100;
        int int24 = lwjgl3ApplicationConfiguration19.g;
        com.badlogic.gdx.Files.FileType fileType25 = lwjgl3ApplicationConfiguration19.getpreferencesFileType();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType30 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration19.setpreferencesFileType(fileType30);
        lwjgl3ApplicationConfiguration19.setaudioDeviceBufferCount(9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration35.setpreferencesFileType(fileType36);
        lwjgl3ApplicationConfiguration35.setsamples((int) (short) 0);
        int int40 = lwjgl3ApplicationConfiguration35.getgles30ContextMinorVersion();
        int int41 = lwjgl3ApplicationConfiguration35.g;
        lwjgl3ApplicationConfiguration35.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = lwjgl3ApplicationConfiguration35.hdpiMode;
        lwjgl3ApplicationConfiguration19.hdpiMode = hdpiMode44;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode44;
        boolean boolean47 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + fileType25 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType25.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + fileType30 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType30.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test21930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21930");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.setdisableAudio(true);
        lwjgl3ApplicationConfiguration0.windowWidth = 33488386;
        int int14 = lwjgl3ApplicationConfiguration0.windowX;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test21931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21931");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color9 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color9;
        int int11 = color9.toIntBits();
        float float12 = color9.r;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26367 + "'", int11 == 26367);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test21932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21932");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color5);
        float float7 = color6.a;
        int int8 = com.badlogic.gdx.graphics.Color.argb8888(color6);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16776960 + "'", int8 == 16776960);
    }

    @Test
    public void test21933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21933");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        com.badlogic.gdx.Files.FileType fileType3 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType3);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 10;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        lwjgl3ApplicationConfiguration0.windowHeight = 16711935;
        lwjgl3ApplicationConfiguration0.windowWidth = (-16646387);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration15.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration15.setWindowedMode(56864, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode23 = lwjgl3ApplicationConfiguration15.fullscreenMode;
        int int24 = lwjgl3ApplicationConfiguration15.samples;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration15.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration15.windowListener = lwjgl3WindowListener26;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = lwjgl3ApplicationConfiguration15.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNull(lwjgl3DisplayMode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21934");
        com.badlogic.gdx.graphics.Color color1 = com.badlogic.gdx.graphics.Color.valueOf("0000ee00");
        color1.r = 2.2591532E-38f;
        com.badlogic.gdx.graphics.Color color5 = color1.mul((float) (-98050048));
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test21935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21935");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color3 = color1.set(color2);
        float float4 = color2.b;
        float float5 = color2.r;
        com.badlogic.gdx.graphics.Color color10 = color2.set((float) (byte) 1, (float) (byte) 10, 0.0f, 0.69803923f);
        com.badlogic.gdx.graphics.Color color11 = color2.cpy();
        int int12 = com.badlogic.gdx.graphics.Color.rgb888(color2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str14 = lwjgl3ApplicationConfiguration13.title;
        com.badlogic.gdx.graphics.Color color15 = com.badlogic.gdx.graphics.Color.GRAY;
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color15, 16);
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color15);
        boolean boolean20 = color2.equals((java.lang.Object) color15);
        int int21 = color15.toIntBits();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16776960 + "'", int12 == 16776960);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1114112 + "'", int21 == 1114112);
    }

    @Test
    public void test21936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21936");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color(1.5612034E-37f, (float) (-16711680), 2.5243549E-29f, (float) (-1306385665));
        com.badlogic.gdx.graphics.Color color6 = color4.set((int) (short) 0);
        int int7 = com.badlogic.gdx.graphics.Color.rgba4444(color4);
        java.lang.String str8 = color4.toString();
        int int9 = com.badlogic.gdx.graphics.Color.rgba8888(color4);
        com.badlogic.gdx.graphics.Color color15 = color4.lerp((float) (-159989760), (-1.609322E29f), (-1.70141E38f), (float) (-11956), (float) 579100672);
        com.badlogic.gdx.graphics.Color color20 = color4.mul((float) (-53295), 5.902958E20f, (float) (-13935232), (float) (-487968));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00000000" + "'", str8, "00000000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test21937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21937");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-32824));
    }

    @Test
    public void test21938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21938");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.title = "88bb2222";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean14 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.r = (-1792);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-12989440);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "52750000";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test21939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21939");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setdepth(100);
        lwjgl3ApplicationConfiguration0.b = 480;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration10.setvSyncEnabled(false);
        lwjgl3ApplicationConfiguration10.windowY = 3276808;
        boolean boolean15 = lwjgl3ApplicationConfiguration10.windowDecorated;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test21940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21940");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        int int9 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(20160);
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-248));
        lwjgl3ApplicationConfiguration0.windowY = 10;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-12989440);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21941");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration8);
        int int10 = lwjgl3ApplicationConfiguration9.windowHeight;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration9);
        lwjgl3ApplicationConfiguration11.setsamples(2);
        int int14 = lwjgl3ApplicationConfiguration11.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration11.windowY = (-592113664);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test21942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21942");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = '4';
        int int5 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.gles30ContextMajorVersion = ' ';
        com.badlogic.gdx.Files.FileType fileType10 = com.badlogic.gdx.Files.FileType.Absolute;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType10);
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType10;
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        int int15 = lwjgl3ApplicationConfiguration0.getsamples();
        int int16 = lwjgl3ApplicationConfiguration0.getwindowX();
        java.lang.String str17 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode18;
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int21 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setwindowY((-272384));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + fileType20 + "' != '" + com.badlogic.gdx.Files.FileType.Absolute + "'", fileType20.equals(com.badlogic.gdx.Files.FileType.Absolute));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test21943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21943");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration7.audioDeviceBufferSize = (-10420224);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration10.setpreferencesFileType(fileType11);
        lwjgl3ApplicationConfiguration10.useVsync(false);
        lwjgl3ApplicationConfiguration10.samples = 2;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration10);
        lwjgl3ApplicationConfiguration17.setwindowX((int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType20 = lwjgl3ApplicationConfiguration17.getpreferencesFileType();
        int int21 = lwjgl3ApplicationConfiguration17.gles30ContextMinorVersion;
        int int22 = lwjgl3ApplicationConfiguration17.b;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType26 = lwjgl3ApplicationConfiguration23.preferencesFileType;
        lwjgl3ApplicationConfiguration17.setpreferencesFileType(fileType26);
        lwjgl3ApplicationConfiguration7.preferencesFileType = fileType26;
        lwjgl3ApplicationConfiguration7.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration7);
        boolean boolean32 = lwjgl3ApplicationConfiguration31.getvSyncEnabled();
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration7);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertNull(fileType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + fileType26 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType26.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test21944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21944");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration0.a = (-62986);
        lwjgl3ApplicationConfiguration0.windowX = 0;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode12;
        lwjgl3ApplicationConfiguration0.r = 2147483647;
        lwjgl3ApplicationConfiguration0.windowY = 16;
        int int18 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.b = 65295;
        lwjgl3ApplicationConfiguration0.a = (-520093706);
        java.lang.String str23 = lwjgl3ApplicationConfiguration0.title;
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test21945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21945");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.windowListener = lwjgl3WindowListener10;
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode14 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode14;
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = (-15667200);
        int int18 = lwjgl3ApplicationConfiguration0.stencil;
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        int int21 = lwjgl3ApplicationConfiguration0.b;
        boolean boolean22 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-62986) + "'", int18 == (-62986));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test21946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21946");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-570425600), (float) 7680, (float) (-16777119), (float) (-2));
        int int5 = com.badlogic.gdx.graphics.Color.rgb888(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65280 + "'", int5 == 65280);
    }

    @Test
    public void test21947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21947");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        int int18 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(852308735);
        int int23 = lwjgl3ApplicationConfiguration0.depth;
        boolean boolean24 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int25 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        int int26 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test21948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21948");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-134242816), (float) (-2105704448), (-4.454078E37f), (float) (-65568));
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color((-918031));
        com.badlogic.gdx.graphics.Color color7 = color4.set(color6);
        com.badlogic.gdx.graphics.Color color8 = color7.clamp();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(3);
        color10.a = (byte) 100;
        com.badlogic.gdx.graphics.Color color13 = color10.clamp();
        com.badlogic.gdx.graphics.Color.rgba8888ToColor(color10, (-1902614));
        com.badlogic.gdx.graphics.Color color20 = color10.set((float) (byte) 1, (float) '4', (float) 6529016, (float) (-16734721));
        com.badlogic.gdx.graphics.Color color21 = color20.cpy();
        com.badlogic.gdx.graphics.Color color22 = new com.badlogic.gdx.graphics.Color(color21);
        com.badlogic.gdx.graphics.Color color24 = color8.lerp(color22, (-1.7000089E38f));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test21949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21949");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        com.badlogic.gdx.Files.FileType fileType8 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        int int9 = lwjgl3ApplicationConfiguration0.samples;
        int int10 = lwjgl3ApplicationConfiguration0.windowHeight;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (-16711680));
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        lwjgl3ApplicationConfiguration0.windowHeight = 61450;
        java.lang.String str18 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration19.setWindowedMode(12750, (-142018560));
        org.junit.Assert.assertNull(fileType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 480 + "'", int10 == 480);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration19);
    }

    @Test
    public void test21950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21950");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.ROYAL;
        java.lang.String str1 = color0.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color0, (-33488131));
        com.badlogic.gdx.graphics.Color.rgb565ToColor(color0, (-1644167168));
        int int6 = com.badlogic.gdx.graphics.Color.rgba8888(color0);
        com.badlogic.gdx.graphics.Color color7 = color0.premultiplyAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00ff0000" + "'", str1, "00ff0000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test21951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21951");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        int int7 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.b = (-62986);
        lwjgl3ApplicationConfiguration0.b = 2;
        int int12 = lwjgl3ApplicationConfiguration0.windowHeight;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        int int15 = lwjgl3ApplicationConfiguration14.getsamples();
        lwjgl3ApplicationConfiguration14.setdepth(25500);
        int int18 = lwjgl3ApplicationConfiguration14.getwindowWidth();
        boolean boolean19 = lwjgl3ApplicationConfiguration14.disableAudio;
        lwjgl3ApplicationConfiguration14.disableAudio(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test21952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21952");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration0.setwindowY((int) '#');
        int int11 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        int int12 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        java.lang.String str13 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.windowY = 3345345;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20188 + "'", int12 == 20188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test21953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21953");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 10L, (float) 1, (float) 0, (float) (short) -1);
        color4.r = 63519;
        com.badlogic.gdx.graphics.Color color12 = color4.lerp((float) 1, (-1.6974137E38f), (float) 9, 0.19607843f, (float) (-255));
        com.badlogic.gdx.graphics.Color color13 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color18 = color13.mul((float) 16252680, (float) 3570, (float) (-10158080), (float) (-65358));
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        float float20 = color19.r;
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test21954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21954");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        boolean boolean9 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        boolean boolean10 = lwjgl3ApplicationConfiguration0.initialVisible;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        boolean boolean13 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1295777792);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21955");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(true);
        int int11 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test21956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21956");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color5, 100);
        com.badlogic.gdx.graphics.Color color9 = color5.mul(100.0f);
        com.badlogic.gdx.graphics.Color.argb8888ToColor(color9, 8897069);
        com.badlogic.gdx.graphics.Color color12 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color17 = color12.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color(color12);
        com.badlogic.gdx.graphics.Color color19 = new com.badlogic.gdx.graphics.Color(color18);
        int int20 = com.badlogic.gdx.graphics.Color.argb8888(color19);
        int int21 = com.badlogic.gdx.graphics.Color.rgba8888(color19);
        com.badlogic.gdx.graphics.Color color23 = color9.lerp(color19, (float) 1044480);
        com.badlogic.gdx.graphics.Color color24 = new com.badlogic.gdx.graphics.Color();
        com.badlogic.gdx.graphics.Color color25 = color9.sub(color24);
        com.badlogic.gdx.graphics.Color color26 = color24.clamp();
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color(color24);
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color24, (-1860608));
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16777215 + "'", int20 == 16777215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-256) + "'", int21 == (-256));
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
    }

    @Test
    public void test21957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21957");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.windowResizable = true;
        lwjgl3ApplicationConfiguration0.setAudioConfig((-940), 2, 35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType14);
        lwjgl3ApplicationConfiguration13.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType19);
        lwjgl3ApplicationConfiguration13.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration13.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration13.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration13);
        lwjgl3ApplicationConfiguration13.a = (-255);
        int int31 = lwjgl3ApplicationConfiguration13.getsamples();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration32.setpreferencesFileType(fileType33);
        lwjgl3ApplicationConfiguration32.disableAudio = true;
        lwjgl3ApplicationConfiguration32.initialVisible = true;
        int int39 = lwjgl3ApplicationConfiguration32.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration32.b = (-62986);
        lwjgl3ApplicationConfiguration32.b = 2;
        lwjgl3ApplicationConfiguration32.setwindowX((int) 'a');
        int int46 = lwjgl3ApplicationConfiguration32.gles30ContextMajorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration48.setpreferencesFileType(fileType49);
        lwjgl3ApplicationConfiguration48.useVsync(false);
        lwjgl3ApplicationConfiguration48.setWindowedMode(512, (int) '#');
        lwjgl3ApplicationConfiguration48.a = (-62986);
        lwjgl3ApplicationConfiguration48.setdisableAudio(true);
        boolean boolean60 = lwjgl3ApplicationConfiguration48.disableAudio;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode63 = null;
        lwjgl3ApplicationConfiguration62.setFullscreenMode(displayMode63);
        lwjgl3ApplicationConfiguration62.windowX = 100;
        int int67 = lwjgl3ApplicationConfiguration62.g;
        com.badlogic.gdx.Files.FileType fileType68 = lwjgl3ApplicationConfiguration62.getpreferencesFileType();
        lwjgl3ApplicationConfiguration48.setPreferencesConfig("ffffff00", fileType68);
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("000000ff", fileType68);
        lwjgl3ApplicationConfiguration13.setpreferencesFileType(fileType68);
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType68);
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((-554880));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 512 + "'", int39 == 512);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 8 + "'", int67 == 8);
        org.junit.Assert.assertTrue("'" + fileType68 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType68.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21958");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(63550);
    }

    @Test
    public void test21959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21959");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) 16773376, (float) (-33853952), 0.050980393f, (float) (-154));
    }

    @Test
    public void test21960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21960");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setsamples(1671296512);
        int int15 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int16 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        java.lang.String str18 = lwjgl3ApplicationConfiguration17.preferencesDirectory;
        lwjgl3ApplicationConfiguration17.setWindowedMode((-54538), 12750);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 480 + "'", int15 == 480);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".prefs/" + "'", str18, ".prefs/");
    }

    @Test
    public void test21961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21961");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-1980237824), (float) (-16711680), (float) 31, (float) (-65024));
        com.badlogic.gdx.graphics.Color color6 = color4.set((-558174448));
        float float7 = color4.b;
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.9372549f + "'", float7 == 0.9372549f);
    }

    @Test
    public void test21962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21962");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        int int10 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.initialVisible;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration12.setpreferencesFileType(fileType13);
        lwjgl3ApplicationConfiguration12.disableAudio = true;
        int int17 = lwjgl3ApplicationConfiguration12.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode18 = lwjgl3ApplicationConfiguration12.fullscreenMode;
        lwjgl3ApplicationConfiguration12.setwindowHeight(20188);
        lwjgl3ApplicationConfiguration12.setwindowY((int) '#');
        lwjgl3ApplicationConfiguration12.setwindowHeight((int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration25.samples = (-1);
        lwjgl3ApplicationConfiguration25.useGL30 = true;
        lwjgl3ApplicationConfiguration25.setpreferencesDirectory("ffff72ff");
        int int34 = lwjgl3ApplicationConfiguration25.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration25.windowY = 20188;
        int int37 = lwjgl3ApplicationConfiguration25.getaudioDeviceBufferCount();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = lwjgl3ApplicationConfiguration25.hdpiMode;
        lwjgl3ApplicationConfiguration12.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode38;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferCount = (-124);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 150405120;
        lwjgl3ApplicationConfiguration0.b = (-478150656);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode18);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21963");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BLACK;
        float float1 = color0.r;
        com.badlogic.gdx.graphics.Color color6 = color0.set((-8.0750596E37f), 0.0f, (float) (-1L), (float) 65024);
        com.badlogic.gdx.graphics.Color color7 = color0.cpy();
        com.badlogic.gdx.graphics.Color color8 = color0.clamp();
        int int9 = com.badlogic.gdx.graphics.Color.rgb888(color0);
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-128512));
        com.badlogic.gdx.graphics.Color.rgba4444ToColor(color0, (-64));
        color0.a = 167709184;
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color(color0);
        com.badlogic.gdx.graphics.Color color17 = color16.cpy();
        com.badlogic.gdx.graphics.Color color18 = color17.clamp();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test21964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21964");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        int int4 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.setwindowWidth((-50176));
        com.badlogic.gdx.graphics.Color color8 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test21965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21965");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        int int7 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1241513983), 6147990);
        lwjgl3ApplicationConfiguration0.setwindowResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowWidth(268493567);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration16.windowWidth = (-1068630016);
        int int19 = lwjgl3ApplicationConfiguration16.audioDeviceBufferSize;
        lwjgl3ApplicationConfiguration16.audioDeviceSimultaneousSources = (-820510720);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test21966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21966");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 512);
        boolean boolean9 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        lwjgl3ApplicationConfiguration0.useVsync(true);
        int int12 = lwjgl3ApplicationConfiguration0.getdepth();
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setuseGL30(true);
        boolean boolean16 = lwjgl3ApplicationConfiguration0.windowResizable;
        com.badlogic.gdx.Files.FileType fileType17 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(fileType17);
    }

    @Test
    public void test21967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21967");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(3, 8897069);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.a = (-255);
        int int18 = lwjgl3ApplicationConfiguration0.getsamples();
        lwjgl3ApplicationConfiguration0.windowWidth = (-940);
        int int21 = lwjgl3ApplicationConfiguration0.g;
        int int22 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int23 = lwjgl3ApplicationConfiguration0.windowY;
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 480 + "'", int22 == 480);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8897069 + "'", int23 == 8897069);
    }

    @Test
    public void test21968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21968");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        int int12 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test21969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21969");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        int int6 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.b = (-1306385665);
        int int9 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test21970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21970");
        int int1 = com.badlogic.gdx.graphics.Color.alpha((float) 933216288);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test21971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21971");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(43268);
        com.badlogic.gdx.graphics.Color color6 = color1.mul((float) (-285212673), (float) (-16741598), (float) (-848655), (float) (-33488896));
        com.badlogic.gdx.graphics.Color color7 = color1.cpy();
        com.badlogic.gdx.graphics.Color color12 = color7.mul((float) (-285212673), (float) (-369624832), (-2.9775E-41f), (float) (-16729345));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test21972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21972");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.a = (byte) 10;
        boolean boolean5 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int6 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.stencil = (-1280);
        int int12 = lwjgl3ApplicationConfiguration0.getsamples();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test21973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21973");
        com.badlogic.gdx.graphics.Color color0 = com.badlogic.gdx.graphics.Color.BROWN;
        com.badlogic.gdx.graphics.Color color5 = color0.add((float) '4', (float) ' ', (float) (short) 100, 0.0f);
        com.badlogic.gdx.graphics.Color color6 = new com.badlogic.gdx.graphics.Color(color0);
        int int7 = color0.toIntBits();
        com.badlogic.gdx.graphics.Color color8 = color0.clamp();
        com.badlogic.gdx.graphics.Color color9 = color8.premultiplyAlpha();
        com.badlogic.gdx.graphics.Color color10 = new com.badlogic.gdx.graphics.Color(color8);
        int int11 = com.badlogic.gdx.graphics.Color.rgb565(color8);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16777215 + "'", int7 == 16777215);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test21974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21974");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        java.lang.String str1 = lwjgl3ApplicationConfiguration0.title;
        lwjgl3ApplicationConfiguration0.a = (-1);
        boolean boolean4 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.setaudioDeviceSimultaneousSources(65024);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-1562574848));
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-10887648));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.windowHeight = 34303;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
    }

    @Test
    public void test21975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21975");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        com.badlogic.gdx.graphics.Color color9 = lwjgl3ApplicationConfiguration0.initialBackgroundColor;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode10 = null;
        lwjgl3ApplicationConfiguration0.fullscreenMode = lwjgl3DisplayMode10;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        boolean boolean13 = lwjgl3ApplicationConfiguration12.vSyncEnabled;
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode14);
        int int16 = lwjgl3ApplicationConfiguration12.audioDeviceSimultaneousSources;
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test21976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21976");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        int int7 = lwjgl3ApplicationConfiguration0.b;
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.graphics.Color color12 = new com.badlogic.gdx.graphics.Color((int) (short) 100);
        com.badlogic.gdx.graphics.Color color13 = com.badlogic.gdx.graphics.Color.FIREBRICK;
        com.badlogic.gdx.graphics.Color color14 = color12.set(color13);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        lwjgl3ApplicationConfiguration0.initialVisible = true;
        lwjgl3ApplicationConfiguration0.audioDeviceBufferSize = (-752);
        int int20 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        boolean boolean21 = lwjgl3ApplicationConfiguration0.useGL30;
        lwjgl3ApplicationConfiguration0.windowWidth = (-780810);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test21977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21977");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        int int6 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        com.badlogic.gdx.graphics.Color color7 = com.badlogic.gdx.graphics.Color.CYAN;
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color7, (int) 'a');
        com.badlogic.gdx.graphics.Color color10 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY;
        com.badlogic.gdx.graphics.Color color12 = color7.lerp(color10, (float) (short) 0);
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color12;
        int int14 = lwjgl3ApplicationConfiguration0.windowY;
        java.lang.String str15 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        int int16 = lwjgl3ApplicationConfiguration0.getdepth();
        int int17 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 480 + "'", int6 == 480);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".prefs/" + "'", str15, ".prefs/");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test21978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21978");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        java.lang.String str8 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration9 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion((-33488131));
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = lwjgl3ApplicationConfiguration0.windowListener;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNull(lwjgl3WindowListener13);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration16);
    }

    @Test
    public void test21979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21979");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color(16771591);
    }

    @Test
    public void test21980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21980");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        lwjgl3ApplicationConfiguration0.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration0.setwindowY((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 10;
        int int15 = lwjgl3ApplicationConfiguration0.getwindowY();
        lwjgl3ApplicationConfiguration0.initialVisible = false;
        int int18 = lwjgl3ApplicationConfiguration0.samples;
        int int19 = lwjgl3ApplicationConfiguration0.getwindowX();
        int int20 = lwjgl3ApplicationConfiguration0.windowY;
        int int21 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ff00ff00";
        int int24 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test21981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21981");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.depth = (short) 10;
        int int5 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        lwjgl3ApplicationConfiguration0.setwindowWidth(52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.g = (-16);
        boolean boolean11 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        int int14 = lwjgl3ApplicationConfiguration0.g;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-16) + "'", int14 == (-16));
    }

    @Test
    public void test21982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21982");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setwindowHeight((int) (byte) 10);
        int int7 = lwjgl3ApplicationConfiguration0.getdepth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferSize((int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1611265692), (-50135050));
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-61455);
        lwjgl3ApplicationConfiguration0.setTitle("ffffe6ff");
        boolean boolean17 = lwjgl3ApplicationConfiguration0.windowDecorated;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int19 = lwjgl3ApplicationConfiguration18.getaudioDeviceBufferSize();
        int int20 = lwjgl3ApplicationConfiguration18.b;
        lwjgl3ApplicationConfiguration18.a = 8;
        lwjgl3ApplicationConfiguration18.useGL30 = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = lwjgl3ApplicationConfiguration18.hdpiMode;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode25);
        int int27 = lwjgl3ApplicationConfiguration0.getgles30ContextMinorVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test21983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21983");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = (-10);
        int int14 = lwjgl3ApplicationConfiguration0.windowHeight;
        int int15 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.setuseGL30(false);
        int int18 = lwjgl3ApplicationConfiguration0.g;
        int int19 = lwjgl3ApplicationConfiguration0.r;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration20.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration20.samples = '4';
        int int25 = lwjgl3ApplicationConfiguration20.r;
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.windowY = (-2147283968);
        lwjgl3ApplicationConfiguration20.setWindowPosition((-2460160), 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration33.setpreferencesFileType(fileType34);
        lwjgl3ApplicationConfiguration33.disableAudio = true;
        lwjgl3ApplicationConfiguration33.initialVisible = true;
        int int40 = lwjgl3ApplicationConfiguration33.getaudioDeviceBufferSize();
        lwjgl3ApplicationConfiguration33.b = (-62986);
        lwjgl3ApplicationConfiguration33.b = 2;
        lwjgl3ApplicationConfiguration33.setwindowX((int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setdepth((int) (byte) 1);
        lwjgl3ApplicationConfiguration47.setwindowWidth((int) (byte) 100);
        lwjgl3ApplicationConfiguration47.setWindowedMode(56864, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode55 = lwjgl3ApplicationConfiguration47.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration56.setpreferencesFileType(fileType57);
        lwjgl3ApplicationConfiguration56.disableAudio = true;
        int int61 = lwjgl3ApplicationConfiguration56.windowY;
        int int62 = lwjgl3ApplicationConfiguration56.audioDeviceBufferCount;
        int int63 = lwjgl3ApplicationConfiguration56.a;
        boolean boolean64 = lwjgl3ApplicationConfiguration56.getvSyncEnabled();
        lwjgl3ApplicationConfiguration56.windowHeight = 'a';
        com.badlogic.gdx.Graphics.DisplayMode displayMode67 = null;
        lwjgl3ApplicationConfiguration56.setFullscreenMode(displayMode67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration69.setpreferencesFileType(fileType70);
        lwjgl3ApplicationConfiguration69.setsamples((int) (short) 0);
        int int74 = lwjgl3ApplicationConfiguration69.getgles30ContextMinorVersion();
        int int75 = lwjgl3ApplicationConfiguration69.g;
        lwjgl3ApplicationConfiguration69.title = "00000000";
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = lwjgl3ApplicationConfiguration69.hdpiMode;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode78);
        lwjgl3ApplicationConfiguration47.hdpiMode = hdpiMode78;
        lwjgl3ApplicationConfiguration47.vSyncEnabled = false;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration83 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode84 = null;
        lwjgl3ApplicationConfiguration83.setFullscreenMode(displayMode84);
        com.badlogic.gdx.Files.FileType fileType86 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration83.setpreferencesFileType(fileType86);
        lwjgl3ApplicationConfiguration83.audioDeviceBufferSize = (short) 1;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode90 = lwjgl3ApplicationConfiguration83.hdpiMode;
        lwjgl3ApplicationConfiguration47.hdpiMode = hdpiMode90;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration20.hdpiMode = hdpiMode90;
        lwjgl3ApplicationConfiguration0.hdpiMode = hdpiMode90;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 480 + "'", int14 == 480);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertNull(lwjgl3DisplayMode55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertTrue("'" + hdpiMode78 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode78.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + fileType86 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType86.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + hdpiMode90 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode90.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test21984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21984");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        int int5 = lwjgl3ApplicationConfiguration0.windowY;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode6 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration8.setFullscreenMode(displayMode9);
        lwjgl3ApplicationConfiguration8.windowX = 100;
        int int13 = lwjgl3ApplicationConfiguration8.g;
        com.badlogic.gdx.Files.FileType fileType14 = lwjgl3ApplicationConfiguration8.preferencesFileType;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("4169e1ff", fileType14);
        lwjgl3ApplicationConfiguration0.title = "ffff72ff";
        int int18 = lwjgl3ApplicationConfiguration0.windowWidth;
        lwjgl3ApplicationConfiguration0.setsamples(2016);
        java.lang.String str21 = lwjgl3ApplicationConfiguration0.title;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode22 = lwjgl3ApplicationConfiguration0.fullscreenMode;
        lwjgl3ApplicationConfiguration0.vSyncEnabled = true;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode27);
        com.badlogic.gdx.Files.FileType fileType29 = com.badlogic.gdx.Files.FileType.External;
        lwjgl3ApplicationConfiguration26.setpreferencesFileType(fileType29);
        lwjgl3ApplicationConfiguration26.audioDeviceBufferSize = (short) 1;
        lwjgl3ApplicationConfiguration26.r = 1114112;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.setDecorated(false);
        lwjgl3ApplicationConfiguration35.a = (byte) 10;
        boolean boolean40 = lwjgl3ApplicationConfiguration35.initialVisible;
        int int41 = lwjgl3ApplicationConfiguration35.b;
        lwjgl3ApplicationConfiguration35.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType44 = lwjgl3ApplicationConfiguration35.preferencesFileType;
        lwjgl3ApplicationConfiguration35.setwindowWidth((int) (byte) 100);
        int int47 = lwjgl3ApplicationConfiguration35.getwindowY();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.audioDeviceBufferSize = ' ';
        lwjgl3ApplicationConfiguration48.setwindowResizable(true);
        lwjgl3ApplicationConfiguration48.gles30ContextMajorVersion = (-567943452);
        lwjgl3ApplicationConfiguration48.vSyncEnabled = false;
        lwjgl3ApplicationConfiguration48.setuseGL30(false);
        lwjgl3ApplicationConfiguration48.stencil = 16;
        lwjgl3ApplicationConfiguration48.initialVisible = true;
        com.badlogic.gdx.Files.FileType fileType63 = lwjgl3ApplicationConfiguration48.getpreferencesFileType();
        lwjgl3ApplicationConfiguration35.preferencesFileType = fileType63;
        lwjgl3ApplicationConfiguration26.preferencesFileType = fileType63;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("ffff0a00", fileType63);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + fileType14 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType14.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 640 + "'", int18 == 640);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ffff72ff" + "'", str21, "ffff72ff");
        org.junit.Assert.assertNull(lwjgl3DisplayMode22);
        org.junit.Assert.assertTrue("'" + fileType29 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType29.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + fileType44 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType44.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + fileType63 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType63.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21985");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((int) (byte) 100);
        com.badlogic.gdx.graphics.Color color2 = com.badlogic.gdx.graphics.Color.BLACK;
        float float3 = color2.r;
        color2.r = 1671296512;
        com.badlogic.gdx.graphics.Color color6 = color1.sub(color2);
        color2.r = 166464000;
        com.badlogic.gdx.graphics.Color color13 = color2.set(16.0f, (float) 8, (float) (-45390), (float) (-510));
        float float14 = color13.g;
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test21986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21986");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((-1.0700091E38f), (float) (-1879048192), (-1.6947917E38f), (float) 983023);
        int int5 = com.badlogic.gdx.graphics.Color.rgb565(color4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test21987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21987");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        lwjgl3ApplicationConfiguration0.b = (short) -1;
        com.badlogic.gdx.Files.FileType fileType7 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.stencil = 0;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.getpreferencesFileType();
        lwjgl3ApplicationConfiguration0.windowY = (-36);
        org.junit.Assert.assertNull(fileType7);
        org.junit.Assert.assertNull(fileType10);
    }

    @Test
    public void test21988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21988");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.useGL30 = true;
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("ffff72ff");
        int int9 = lwjgl3ApplicationConfiguration0.getgles30ContextMajorVersion();
        lwjgl3ApplicationConfiguration0.windowX = 512;
        boolean boolean12 = lwjgl3ApplicationConfiguration0.vSyncEnabled;
        lwjgl3ApplicationConfiguration0.stencil = (-1306385665);
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = lwjgl3ApplicationConfiguration0.hdpiMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = lwjgl3ApplicationConfiguration0.hdpiMode;
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 13260, (-61440));
        int int22 = lwjgl3ApplicationConfiguration0.getaudioDeviceSimultaneousSources();
        lwjgl3ApplicationConfiguration0.windowDecorated = true;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode17 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode17.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test21989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21989");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setdepth((int) (byte) 1);
        com.badlogic.gdx.Files.FileType fileType3 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        lwjgl3ApplicationConfiguration0.windowX = (-14513374);
        lwjgl3ApplicationConfiguration0.windowHeight = 0;
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "ffff01ff";
        org.junit.Assert.assertTrue("'" + fileType3 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType3.equals(com.badlogic.gdx.Files.FileType.External));
    }

    @Test
    public void test21990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21990");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.preferencesDirectory;
        lwjgl3ApplicationConfiguration0.r = (-50135050);
        lwjgl3ApplicationConfiguration0.windowY = (-27133);
        lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion = 252960;
        lwjgl3ApplicationConfiguration0.title = "ac0000ff";
        boolean boolean16 = lwjgl3ApplicationConfiguration0.getvSyncEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".prefs/" + "'", str7, ".prefs/");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test21991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21991");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.disableAudio = true;
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.preferencesDirectory = "";
        lwjgl3ApplicationConfiguration0.setwindowX((int) ' ');
        lwjgl3ApplicationConfiguration0.setpreferencesDirectory("4169e1ff");
        int int14 = lwjgl3ApplicationConfiguration0.stencil;
        boolean boolean15 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int16 = lwjgl3ApplicationConfiguration0.depth;
        lwjgl3ApplicationConfiguration0.windowResizable = false;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test21992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21992");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.g;
        com.badlogic.gdx.Files.FileType fileType6 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        java.lang.String str7 = lwjgl3ApplicationConfiguration0.title;
        int int8 = lwjgl3ApplicationConfiguration0.audioDeviceBufferCount;
        lwjgl3ApplicationConfiguration0.windowWidth = (-3342337);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + fileType6 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType6.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test21993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21993");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.windowX = 100;
        int int5 = lwjgl3ApplicationConfiguration0.stencil;
        int int6 = lwjgl3ApplicationConfiguration0.windowY;
        lwjgl3ApplicationConfiguration0.a = 43268;
        int int9 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        com.badlogic.gdx.Files.FileType fileType10 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setwindowHeight((-262646));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration16.setpreferencesFileType(fileType17);
        lwjgl3ApplicationConfiguration16.disableAudio = true;
        int int21 = lwjgl3ApplicationConfiguration16.windowY;
        lwjgl3ApplicationConfiguration16.setWindowPosition((int) ' ', 512);
        lwjgl3ApplicationConfiguration16.setWindowedMode((-59160), (-1562574848));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics.Lwjgl3DisplayMode lwjgl3DisplayMode28 = lwjgl3ApplicationConfiguration16.fullscreenMode;
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode30 = null;
        lwjgl3ApplicationConfiguration29.setFullscreenMode(displayMode30);
        lwjgl3ApplicationConfiguration29.samples = (-1);
        lwjgl3ApplicationConfiguration29.setgles30ContextMajorVersion(1677696502);
        boolean boolean36 = lwjgl3ApplicationConfiguration29.getwindowDecorated();
        lwjgl3ApplicationConfiguration29.setaudioDeviceBufferCount((-33488131));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration39.setpreferencesFileType(fileType40);
        lwjgl3ApplicationConfiguration39.disableAudio = true;
        int int44 = lwjgl3ApplicationConfiguration39.windowY;
        int int45 = lwjgl3ApplicationConfiguration39.audioDeviceBufferCount;
        int int46 = lwjgl3ApplicationConfiguration39.a;
        boolean boolean47 = lwjgl3ApplicationConfiguration39.getvSyncEnabled();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration39.hdpiMode = hdpiMode48;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration29.b = (-10420224);
        int int53 = lwjgl3ApplicationConfiguration29.getaudioDeviceSimultaneousSources();
        com.badlogic.gdx.Files.FileType fileType55 = com.badlogic.gdx.Files.FileType.Classpath;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("hi!", fileType55);
        lwjgl3ApplicationConfiguration16.preferencesFileType = fileType55;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("fffbffe0", fileType55);
        boolean boolean59 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + fileType10 + "' != '" + com.badlogic.gdx.Files.FileType.External + "'", fileType10.equals(com.badlogic.gdx.Files.FileType.External));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(lwjgl3DisplayMode28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertTrue("'" + fileType55 + "' != '" + com.badlogic.gdx.Files.FileType.Classpath + "'", fileType55.equals(com.badlogic.gdx.Files.FileType.Classpath));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test21994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21994");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        int int3 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        lwjgl3ApplicationConfiguration0.setvSyncEnabled(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.copy(lwjgl3ApplicationConfiguration0);
        lwjgl3ApplicationConfiguration6.setaudioDeviceSimultaneousSources((int) (byte) 100);
        lwjgl3ApplicationConfiguration6.setdisableAudio(false);
        boolean boolean11 = lwjgl3ApplicationConfiguration6.vSyncEnabled;
        int int12 = lwjgl3ApplicationConfiguration6.windowHeight;
        lwjgl3ApplicationConfiguration6.windowWidth = (-25088);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(lwjgl3ApplicationConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 480 + "'", int12 == 480);
    }

    @Test
    public void test21995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21995");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType1 = null;
        lwjgl3ApplicationConfiguration0.setpreferencesFileType(fileType1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        lwjgl3ApplicationConfiguration0.initialBackgroundColor = color5;
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        int int9 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferCount();
        lwjgl3ApplicationConfiguration0.useGL30 = false;
        int int12 = lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources;
        boolean boolean13 = lwjgl3ApplicationConfiguration0.initialVisible;
        int int14 = lwjgl3ApplicationConfiguration0.getdepth();
        com.badlogic.gdx.graphics.Color color16 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color18 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        com.badlogic.gdx.graphics.Color color25 = color16.mul(color24);
        com.badlogic.gdx.graphics.Color color27 = new com.badlogic.gdx.graphics.Color((int) (short) -1);
        com.badlogic.gdx.graphics.Color color33 = color27.lerp((float) ' ', (float) (byte) -1, (float) 'a', 0.0f, (float) (byte) 10);
        color33.g = (short) 1;
        com.badlogic.gdx.graphics.Color color37 = color25.lerp(color33, (float) 25500);
        int int38 = com.badlogic.gdx.graphics.Color.rgba8888(color37);
        com.badlogic.gdx.graphics.Color color43 = color37.mul((float) 16, (-1.0f), (float) 524288, 1.7014117E38f);
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        boolean boolean45 = lwjgl3ApplicationConfiguration0.getdisableAudio();
        int int46 = lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion;
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-256) + "'", int38 == (-256));
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test21996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21996");
        com.badlogic.gdx.graphics.Color color4 = new com.badlogic.gdx.graphics.Color((float) (-255), 100.0f, (float) (byte) 100, (float) 41903542);
        com.badlogic.gdx.graphics.Color color5 = com.badlogic.gdx.graphics.Color.SALMON;
        com.badlogic.gdx.graphics.Color color10 = color5.add((float) 100, 1.0f, (float) 0, (float) (byte) 0);
        java.lang.String str11 = color10.toString();
        com.badlogic.gdx.graphics.Color.rgb888ToColor(color10, 1);
        com.badlogic.gdx.graphics.Color color18 = color10.mul((float) 41903542, (float) (-8672), (float) (-50135050), (float) (-10));
        com.badlogic.gdx.graphics.Color color24 = color18.lerp((float) (-65025), (-0.0f), (float) (-65486), (float) (byte) 10, (float) (-1L));
        com.badlogic.gdx.graphics.Color color29 = color24.set((float) 1, (float) 255, (-5.68232E37f), (float) 1677696502);
        float float30 = color24.toFloatBits();
        com.badlogic.gdx.graphics.Color color31 = color4.mul(color24);
        java.lang.String str32 = color31.toString();
        float float33 = color31.toFloatBits();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ffff0000" + "'", str11, "ffff0000");
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-4.28676E37f) + "'", float30 == (-4.28676E37f));
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "00ff00ff" + "'", str32, "00ff00ff");
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-4.2866305E37f) + "'", float33 == (-4.2866305E37f));
    }

    @Test
    public void test21997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21997");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Graphics.DisplayMode displayMode1 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode1);
        lwjgl3ApplicationConfiguration0.samples = (-1);
        lwjgl3ApplicationConfiguration0.setgles30ContextMajorVersion(1677696502);
        boolean boolean7 = lwjgl3ApplicationConfiguration0.getwindowDecorated();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount((-33488131));
        int int10 = lwjgl3ApplicationConfiguration0.a;
        boolean boolean11 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.setdepth(0);
        lwjgl3ApplicationConfiguration0.setgles30ContextMinorVersion(166464000);
        lwjgl3ApplicationConfiguration0.audioDeviceSimultaneousSources = 240;
        lwjgl3ApplicationConfiguration0.samples = (-15187968);
        lwjgl3ApplicationConfiguration0.stencil = 16743932;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test21998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21998");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-62986), (int) (byte) 1, (-1), (int) (short) 0, 512, (-62986), (int) '4');
        int int9 = lwjgl3ApplicationConfiguration0.getwindowHeight();
        int int10 = lwjgl3ApplicationConfiguration0.getwindowWidth();
        lwjgl3ApplicationConfiguration0.setaudioDeviceBufferCount(151015132);
        int int13 = lwjgl3ApplicationConfiguration0.gles30ContextMajorVersion;
        java.lang.String str14 = lwjgl3ApplicationConfiguration0.getpreferencesDirectory();
        lwjgl3ApplicationConfiguration0.setwindowX((-536870912));
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.preferencesFileType = fileType17;
        com.badlogic.gdx.Files.FileType fileType19 = lwjgl3ApplicationConfiguration0.preferencesFileType;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 480 + "'", int9 == 480);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 640 + "'", int10 == 640);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".prefs/" + "'", str14, ".prefs/");
        org.junit.Assert.assertNull(fileType19);
    }

    @Test
    public void test21999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21999");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        int int1 = lwjgl3ApplicationConfiguration0.getaudioDeviceBufferSize();
        boolean boolean2 = lwjgl3ApplicationConfiguration0.windowResizable;
        lwjgl3ApplicationConfiguration0.disableAudio = false;
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setwindowX(10);
        lwjgl3ApplicationConfiguration0.gles30ContextMinorVersion = 151015132;
        lwjgl3ApplicationConfiguration0.setTitle(".prefs/");
        int int13 = lwjgl3ApplicationConfiguration0.getwindowY();
        int int14 = lwjgl3ApplicationConfiguration0.windowWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 640 + "'", int14 == 640);
    }

    @Test
    public void test22000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test22000");
        com.badlogic.gdx.graphics.Color color1 = new com.badlogic.gdx.graphics.Color((-554880));
    }
}
