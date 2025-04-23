package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.*;
import com.xworkz.interfaces.internal.*;


public class runner {
    public static void main(String[] args) {
        Hospital hospital = new ApolloHospital();
        ApolloHospital apolloHospital = new ApolloHospital();
        hospital.clean();
        apolloHospital.clean();

        Fan fan = new CeilingFan();
        CeilingFan ceilingFan = new CeilingFan();
        fan.rotate();
        ceilingFan.rotate();

        Light light = new TubeLight();
        TubeLight tubeLight = new TubeLight();
        light.glow();
        tubeLight.glow();

        Book book = new Novel();
        Novel novel = new Novel();
        book.read();
        novel.read();

        Door door = new MainDoor();
        MainDoor mainDoor = new MainDoor();
        door.open();
        mainDoor.open();

        Pen pen = new BallPen();
        BallPen ballPen = new BallPen();
        pen.write();
        ballPen.write();

        Printer printer = new HPPrinter();
        HPPrinter hpPrinter = new HPPrinter();
        printer.print();
        printer.scan();
        printer.copy();
        hpPrinter.print();
        hpPrinter.scan();
        hpPrinter.copy();

        Vehicle vehicle = new Car();
        Car car = new Car();
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        car.start();
        car.accelerate();
        car.stop();

        Mobile mobile = new SmartPhone();
        SmartPhone smartPhone = new SmartPhone();
        mobile.call();
        mobile.message();
        mobile.browse();
        smartPhone.call();
        smartPhone.message();
        smartPhone.browse();

        TV tv = new LEDTV();
        LEDTV ledtv = new LEDTV();
        tv.switchOn();
        tv.changeChannel();
        tv.adjustVolume();
        ledtv.switchOn();
        ledtv.changeChannel();
        ledtv.adjustVolume();

        Camera camera = new DSLR();
        DSLR dslr = new DSLR();
        camera.capture();
        camera.record();
        camera.zoom();
        dslr.capture();
        dslr.record();
        dslr.zoom();

        Laptop laptop = new DellLaptop();
        DellLaptop dellLaptop = new DellLaptop();
        laptop.boot();
        laptop.shutDown();
        laptop.sleep();
        laptop.restart();
        laptop.hibernate();
        dellLaptop.boot();
        dellLaptop.shutDown();
        dellLaptop.sleep();
        dellLaptop.restart();
        dellLaptop.hibernate();

        WashingMachine machine = new LGWasher();
        LGWasher lgWasher = new LGWasher();
        machine.wash();
        machine.rinse();
        machine.spin();
        machine.dry();
        machine.stop();
        lgWasher.wash();
        lgWasher.rinse();
        lgWasher.spin();
        lgWasher.dry();
        lgWasher.stop();

        SmartWatch watch = new AppleWatch();
        AppleWatch appleWatch = new AppleWatch();
        watch.trackSteps();
        watch.showTime();
        watch.monitorHeartRate();
        watch.receiveNotifications();
        watch.setAlarm();
        appleWatch.trackSteps();
        appleWatch.showTime();
        appleWatch.monitorHeartRate();
        appleWatch.receiveNotifications();
        appleWatch.setAlarm();

        Oven oven = new MicrowaveOven();
        MicrowaveOven microwave = new MicrowaveOven();
        oven.preheat();
        oven.bake();
        oven.grill();
        oven.defrost();
        oven.turnOff();
        microwave.preheat();
        microwave.bake();
        microwave.grill();
        microwave.defrost();
        microwave.turnOff();

        MusicPlayer player = new SpotifyPlayer();
        SpotifyPlayer spotify = new SpotifyPlayer();
        player.play();
        player.pause();
        player.stop();
        player.next();
        player.previous();
        spotify.play();
        spotify.pause();
        spotify.stop();
        spotify.next();
        spotify.previous();

        Calculator calculator = new CasioCalculator();
        CasioCalculator casio = new CasioCalculator();
        calculator.add(); calculator.subtract(); calculator.multiply(); calculator.divide(); calculator.modulo(); calculator.square(); calculator.squareRoot();
        casio.add(); casio.subtract(); casio.multiply(); casio.divide(); casio.modulo(); casio.square(); casio.squareRoot();

        Refrigerator fridge = new LGFridge();
        LGFridge lgFridge = new LGFridge();
        fridge.cool(); fridge.freeze(); fridge.defrost(); fridge.setTemperature(); fridge.openDoor(); fridge.closeDoor(); fridge.lightOn();
        lgFridge.cool(); lgFridge.freeze(); lgFridge.defrost(); lgFridge.setTemperature(); lgFridge.openDoor(); lgFridge.closeDoor(); lgFridge.lightOn();

        Elevator elevator = new OtisElevator();
        OtisElevator otis = new OtisElevator();
        elevator.moveUp(); elevator.moveDown(); elevator.stop(); elevator.openDoor(); elevator.closeDoor(); elevator.emergencyStop(); elevator.ringAlarm();
        otis.moveUp(); otis.moveDown(); otis.stop(); otis.openDoor(); otis.closeDoor(); otis.emergencyStop(); otis.ringAlarm();

        SmartSpeaker speaker = new AlexaSpeaker();
        AlexaSpeaker alexa = new AlexaSpeaker();
        speaker.playMusic(); speaker.pauseMusic(); speaker.stopMusic(); speaker.increaseVolume(); speaker.decreaseVolume(); speaker.readNews(); speaker.answerQuestion();
        alexa.playMusic(); alexa.pauseMusic(); alexa.stopMusic(); alexa.increaseVolume(); alexa.decreaseVolume(); alexa.readNews(); alexa.answerQuestion();

        Router router = new NetgearRouter();
        NetgearRouter netgear = new NetgearRouter();
        router.connect(); router.disconnect(); router.reset(); router.configure(); router.blockDevice(); router.monitorTraffic(); router.updateFirmware();
        netgear.connect(); netgear.disconnect(); netgear.reset(); netgear.configure(); netgear.blockDevice(); netgear.monitorTraffic(); netgear.updateFirmware();
        Drone drone = new DJI();
        DJI dji = new DJI();
        drone.takeOff(); drone.land(); drone.hover(); drone.moveForward(); drone.moveBackward(); drone.moveLeft(); drone.moveRight(); drone.rotate(); drone.captureImage();
        dji.takeOff(); dji.land(); dji.hover(); dji.moveForward(); dji.moveBackward(); dji.moveLeft(); dji.moveRight(); dji.rotate(); dji.captureImage();

        SmartTV stv = new SamsungTV();
        SamsungTV samsung = new SamsungTV();
        stv.turnOn(); stv.turnOff(); stv.connectWifi(); stv.streamVideo(); stv.openApp(); stv.closeApp(); stv.changeVolume(); stv.changeBrightness(); stv.updateSoftware();
        samsung.turnOn(); samsung.turnOff(); samsung.connectWifi(); samsung.streamVideo(); samsung.openApp(); samsung.closeApp(); samsung.changeVolume(); samsung.changeBrightness(); samsung.updateSoftware();

        ATM atm = new HDFCATM();
        HDFCATM hdfc = new HDFCATM();
        atm.insertCard(); atm.enterPin(); atm.checkBalance(); atm.withdrawCash(); atm.depositCash(); atm.transferMoney(); atm.requestStatement(); atm.changePin(); atm.exit();
        hdfc.insertCard(); hdfc.enterPin(); hdfc.checkBalance(); hdfc.withdrawCash(); hdfc.depositCash(); hdfc.transferMoney(); hdfc.requestStatement(); hdfc.changePin(); hdfc.exit();

        SPhone phone = new OnePlus();
        OnePlus oneplus = new OnePlus();
        phone.unlock(); phone.openCamera(); phone.makeCall(); phone.sendMessage(); phone.browseInternet(); phone.playGame(); phone.useGPS(); phone.installApp(); phone.uninstallApp();
        oneplus.unlock(); oneplus.openCamera(); oneplus.makeCall(); oneplus.sendMessage(); oneplus.browseInternet(); oneplus.playGame(); oneplus.useGPS(); oneplus.installApp(); oneplus.uninstallApp();

        FitnessTracker tracker = new FitBit();
        FitBit fitbit = new FitBit();
        tracker.startWorkout(); tracker.stopWorkout(); tracker.trackCalories(); tracker.monitorHeart(); tracker.countSteps(); tracker.logSleep(); tracker.syncData(); tracker.showStats(); tracker.shareProgress();
        fitbit.startWorkout(); fitbit.stopWorkout(); fitbit.trackCalories(); fitbit.monitorHeart(); fitbit.countSteps(); fitbit.logSleep(); fitbit.syncData(); fitbit.showStats(); fitbit.shareProgress();
    }
}