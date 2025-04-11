package com.xworkz.aquiredsecond.runner;

import com.xworkz.aquiredsecond.internal.*;
import com.xworkz.aquiredsecond.external.*;

public class Runner {
    public static void main(String[] args) {

        Person personP = new Person();
        Person personC = new Child();
        personC.sleep();
        System.out.println();
        Child child = new Child();
        child.sleep();
        child.talk();

        Worker worker = new Worker();
        Worker workerC = new Farmer();
        workerC.work();
        System.out.println();
        Farmer farmer = new Farmer();
        farmer.work();
        farmer.yield();

        Animal animal = new Animal();
        Animal animalC = new Dog();
        animalC.makeSound();
        System.out.println();
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();

        Fruit fruit = new Fruit();
        Fruit fruitC = new Banana();
        fruitC.ripen();
        System.out.println();
        Banana banana = new Banana();
        banana.ripen();
        banana.peel();

        Cartoon cartoon = new Cartoon();
        Cartoon cartoonC = new TomAndJerry();
        cartoonC.entertain();
        System.out.println();
        TomAndJerry tj = new TomAndJerry();
        tj.entertain();
        tj.chase();

        Software software = new Software();
        Software software1 = new Antivirus();
        software1.run();
        System.out.println();
        Antivirus antivirus = new Antivirus();
        antivirus.run();
        antivirus.scan();

        ComputerComponent component = new ComputerComponent();
        ComputerComponent component1 = new Processor();
        component1.work();
        System.out.println();
        Processor processor = new Processor();
        processor.work();
        processor.compute();

        Device device = new Device();
        Device device1 = new Smartphone();
        device1.powerOn();
        System.out.println();
        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.installApp();

        Emotion emotion = new Emotion();
        Emotion emotion1 = new Happiness();
        emotion1.feel();
        System.out.println();
        Happiness happy = new Happiness();
        happy.feel();
        happy.smile();

        VehiclePart vehiclePart = new VehiclePart();
        VehiclePart vehicleEngine = new Engine();
        vehicleEngine.function();
        System.out.println();
        Engine engine = new Engine();
        engine.function();
        engine.ignite();

        Beverage beverage = new Beverage();
        Beverage beverageTea = new Tea();
        beverageTea.drink();
        System.out.println();
        Tea tea = new Tea();
        tea.drink();
        tea.addMilk();

        Costume costume = new Costume();
        Costume costumeHero = new SuperheroCostume();
        costumeHero.wear();
        System.out.println();
        SuperheroCostume hero = new SuperheroCostume();
        hero.wear();
        hero.saveWorld();

        Song song = new Song();
        Song nursery = new NurserySong();
        nursery.sing();
        System.out.println();
        NurserySong ns = new NurserySong();
        ns.sing();
        ns.teachAlphabet();

        Puzzle puzzle = new Puzzle();
        Puzzle jigsaw = new JigsawPuzzle();
        jigsaw.solve();
        System.out.println();
        JigsawPuzzle jp = new JigsawPuzzle();
        jp.solve();
        jp.fitPieces();

        Activity activity = new Activity();
        Activity drawingActivity = new Drawing();
        drawingActivity.perform();
        System.out.println();
        Drawing drawing = new Drawing();
        drawing.perform();
        drawing.usePencil();

        Spouse spouse = new Spouse();
        Spouse wifeAsSpouse = new Wife();
        wifeAsSpouse.love();
        System.out.println();
        Wife wife = new Wife();
        wife.love();
        wife.cookMeal();

        Caregiver caregiver = new Caregiver();
        Caregiver babysitterAsCaregiver = new Babysitter();
        babysitterAsCaregiver.takeCare();
        System.out.println();
        Babysitter babysitter = new Babysitter();
        babysitter.takeCare();
        babysitter.changeDiaper();

        Guardian guardian = new Guardian();
        Guardian grandparentAsGuardian = new Grandparent();
        grandparentAsGuardian.protect();
        System.out.println();
        Grandparent grandparent = new Grandparent();
        grandparent.protect();
        grandparent.tellStories();

        Child1 child1 = new Child1();
        Child1 daughterAsChild = new Daughter();
        daughterAsChild.play();
        System.out.println();
        Daughter daughter = new Daughter();
        daughter.play();
        daughter.helpMother();

        Neighbor neighbor = new Neighbor();
        Neighbor nextDoorAsNeighbor = new NextDoorNeighbor();
        nextDoorAsNeighbor.greet();
        System.out.println();
        NextDoorNeighbor nextDoor = new NextDoorNeighbor();
        nextDoor.greet();
        nextDoor.borrowSugar();

        Bag bag = new Bag();
        Bag backpackAsBag = new Backpack();
        backpackAsBag.carry();
        System.out.println();
        Backpack backpack = new Backpack();
        backpack.carry();
        backpack.zipUp();

        Vacation vacation = new Vacation();
        Vacation holidayAsVacation = new BeachHoliday();
        holidayAsVacation.enjoyTime();
        System.out.println();
        BeachHoliday beachHoliday = new BeachHoliday();
        beachHoliday.enjoyTime();
        beachHoliday.swim();

        Friend friend = new Friend();
        Friend bestAsFriend = new BestFriend();
        bestAsFriend.hangOut();
        System.out.println();
        BestFriend best = new BestFriend();
        best.hangOut();
        best.shareSecrets();

        Vehicle vehicle = new Vehicle();
        Vehicle cycleAsVehicle = new Bicycle();
        cycleAsVehicle.move();
        System.out.println();
        Bicycle cycle = new Bicycle();
        cycle.move();
        cycle.ringBell();

        Celebration celebration = new Celebration();
        Celebration partyAsCelebration = new BirthdayParty();
        partyAsCelebration.enjoy();
        BirthdayParty party = new BirthdayParty();
        party.enjoy();
        party.cutCake();

        Container container = new Container();
        Container bottleAsContainer = new Bottle();
        bottleAsContainer.fill();
        Bottle bottle = new Bottle();
        bottle.fill();
        bottle.pour();

        Sibling sibling = new Sibling();
        Sibling brotherAsSibling = new Brother();
        brotherAsSibling.growUpTogether();
        Brother brother = new Brother();
        brother.growUpTogether();
        brother.protect();

        Transport transport = new Transport();
        Transport busAsTransport = new Bus();
        busAsTransport.operate();
        Bus bus = new Bus();
        bus.operate();
        bus.pickPassengers();

        Driver driver = new Driver();
        Driver busDriverAsDriver = new BusDriver();
        busDriverAsDriver.drive();
        BusDriver busDriver = new BusDriver();
        busDriver.drive();
        busDriver.stopAtStation();

        Insect insect = new Insect();
        Insect butterflyAsInsect = new Butterfly();
        butterflyAsInsect.crawl();
        Butterfly butterfly = new Butterfly();
        butterfly.crawl();
        butterfly.fly();

        Vegetable vegetable = new Vegetable();
        Vegetable carrotAsVegetable = new Carrot();
        carrotAsVegetable.grow();
        Carrot carrot = new Carrot();
        carrot.grow();
        carrot.improveVision();

        Pet pet = new Pet();
        Pet catAsPet = new Cat();
        catAsPet.feed();
        Cat cat = new Cat();
        cat.feed();
        cat.purr();

        Furniture furniture = new Furniture();
        Furniture chairAsFurniture = new Chair();
        chairAsFurniture.support();
        Chair chair = new Chair();
        chair.support();
        chair.fold();

        DairyProduct dairyProduct = new DairyProduct();
        DairyProduct cheeseAsDairyProduct = new Cheese();
        cheeseAsDairyProduct.store();
        Cheese cheese = new Cheese();
        cheese.store();
        cheese.melt();

        Hospital hospital = new Hospital();
        Hospital childrenAsHospital = new ChildrenHospital();
        childrenAsHospital.treat();
        ChildrenHospital children = new ChildrenHospital();
        children.treat();
        children.careForKids();

        Snack snack = new Snack();
        Snack chipsAsSnack = new Chips();
        chipsAsSnack.pack();
        Chips chips = new Chips();
        chips.pack();
        chips.crunch();

        Student student = new Student();
        Student collegeStudentAsStudent = new CollegeStudent();
        collegeStudentAsStudent.study();
        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.study();
        collegeStudent.attendLecture();

        Relative relative = new Relative();
        Relative cousinAsRelative = new Cousin();
        cousinAsRelative.visit();
        Cousin cousin = new Cousin();
        cousin.visit();
        cousin.playGames();

        Game game = new Game();
        Game cricketAsGame = new Cricket();
        cricketAsGame.play();
        Cricket cricket = new Cricket();
        cricket.play();
        cricket.scoreRun();

        Festival festival = new Festival();
        Festival diwaliAsFestival = new Diwali();
        diwaliAsFestival.celebrate();
        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.burstCrackers();

        AquaticAnimal aquatic = new AquaticAnimal();
        AquaticAnimal dolphinAsAquatic = new Dolphin();
        dolphinAsAquatic.floatInWater();
        Dolphin dolphin = new Dolphin();
        dolphin.floatInWater();
        dolphin.communicate();

        FlyingAnimal flying = new FlyingAnimal();
        FlyingAnimal eagleAsFlying = new Eagle();
        eagleAsFlying.soar();
        Eagle eagle = new Eagle();
        eagle.soar();
        eagle.hunt();

        Mammal mammal = new Mammal();
        Mammal elephantAsMammal = new Elephant();
        elephantAsMammal.nurseYoung();
        Elephant elephant = new Elephant();
        elephant.nurseYoung();
        elephant.sprayWater();

        ElectronicItem item = new ElectronicItem();
        ElectronicItem fanAsItem = new Fan();
        fanAsItem.consumeElectricity();
        Fan fan = new Fan();
        fan.consumeElectricity();
        fan.rotate();

        Sport sport = new Sport();
        Sport footballAsSport = new Football();
        footballAsSport.play();
        Football football = new Football();
        football.play();
        football.kickBall();

        River river = new River();
        River gangaAsRiver = new Ganga();
        gangaAsRiver.flow();
        Ganga ganga = new Ganga();
        ganga.flow();
        ganga.purify();

        Fish fish = new Fish();
        Fish goldfishAsFish = new Goldfish();
        goldfishAsFish.swim();
        Goldfish goldfish = new Goldfish();
        goldfish.swim();
        goldfish.blowBubbles();

        Ceremony ceremony = new Ceremony();
        Ceremony graduationAsCeremony = new GraduationCeremony();
        graduationAsCeremony.commence();
        GraduationCeremony graduation = new GraduationCeremony();
        graduation.commence();
        graduation.giveDegrees();

        Rock rock = new Rock();
        Rock graniteAsRock = new Granite();
        graniteAsRock.erodeSlowly();
        Granite granite = new Granite();
        granite.erodeSlowly();
        granite.polish();

        Store store = new Store();
        Store groceryStoreAsStore = new GroceryStore();
        groceryStoreAsStore.sellItems();
        GroceryStore groceryStore = new GroceryStore();
        groceryStore.sellItems();
        groceryStore.stockFood();

        Instrument instrument = new Instrument();
        Instrument guitarAsInstrument = new Guitar();
        guitarAsInstrument.play();
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.strum();

        Tool tool = new Tool();
        Tool hammerAsTool = new Hammer();
        hammerAsTool.use();
        Hammer hammer = new Hammer();
        hammer.use();
        hammer.hitNail();

        Emotion emotionP = new Emotion();
        Emotion happinessAsEmotion = new Happiness();
        happinessAsEmotion.feel();
        Happiness happiness = new Happiness();
        happiness.feel();
        happiness.smile();

        School school = new School();
        School highSchoolAsSchool = new HighSchool();
        highSchoolAsSchool.teach();
        HighSchool highSchool = new HighSchool();
        highSchool.teach();
        highSchool.conductExams();

        Mountain mountain = new Mountain();
        Mountain himalayaAsMountain = new Himalaya();
        himalayaAsMountain.standTall();
        Himalaya himalaya = new Himalaya();
        himalaya.standTall();
        himalaya.attractClimbers();

        Temple temple = new Temple();
        Temple hinduTempleAsTemple = new HinduTemple();
        hinduTempleAsTemple.worship();
        HinduTemple hinduTemple = new HinduTemple();
        hinduTemple.worship();
        hinduTemple.ringBell();

        Building building = new Building();
        Building houseAsBuilding = new House();
        houseAsBuilding.openDoor();
        House house = new House();
        house.openDoor();
        house.switchOnLights();

        Partner partner = new Partner();
        Partner husbandAsPartner = new Husband();
        husbandAsPartner.support();
        Husband husband = new Husband();
        husband.support();
        husband.provide();

        Dessert dessert = new Dessert();
        Dessert iceCreamAsDessert = new IceCream();
        iceCreamAsDessert.serve();
        IceCream iceCream = new IceCream();
        iceCream.serve();
        iceCream.freeze();

        Country country = new Country();
        Country indiaAsCountry = new India();
        indiaAsCountry.unite();
        India india = new India();
        india.unite();
        india.celebrateDiversity();

        Drink drink = new Drink();
        Drink juiceAsDrink = new Juice();
        juiceAsDrink.serve();
        Juice juice = new Juice();
        juice.serve();
        juice.mixFlavors();

        Room room = new Room();
        Room kitchenAsRoom = new Kitchen();
        kitchenAsRoom.enter();
        Kitchen kitchen = new Kitchen();
        kitchen.enter();
        kitchen.cookFood();

        Sweet sweet = new Sweet();
        Sweet ladooAsSweet = new Ladoo();
        ladooAsSweet.make();
        Ladoo ladoo = new Ladoo();
        ladoo.make();
        ladoo.offerInTemple();

        Reptile reptile = new Reptile();
        Reptile lizardAsReptile = new Lizard();
        lizardAsReptile.shedSkin();
        Lizard lizard = new Lizard();
        lizard.shedSkin();
        lizard.climbWall();

        Meal meal = new Meal();
        Meal lunchAsMeal = new Lunch();
        lunchAsMeal.serve();
        Lunch lunch = new Lunch();
        lunch.serve();
        lunch.energize();

        Tree tree = new Tree();
        Tree mangoTreeAsTree = new MangoTree();
        mangoTreeAsTree.grow();
        MangoTree mangoTree = new MangoTree();
        mangoTree.grow();
        mangoTree.produceMangoes();

        Teacher teacher = new Teacher();
        Teacher mathTeacherAsTeacher = new MathTeacher();
        mathTeacherAsTeacher.teach();
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.teach();
        mathTeacher.solveEquation();

        KitchenAppliance appliance = new KitchenAppliance();
        KitchenAppliance mixerAsAppliance = new Mixer();
        mixerAsAppliance.plugIn();
        Mixer mixer = new Mixer();
        mixer.plugIn();
        mixer.blend();

        Day day = new Day();
        Day mondayAsDay = new Monday();
        mondayAsDay.start();
        Monday monday = new Monday();
        monday.start();
        monday.feelLazy();

        TimePeriod time = new TimePeriod();
        TimePeriod morningAsTime = new Morning();
        morningAsTime.begin();
        Morning morning = new Morning();
        morning.begin();
        morning.shineSun();

        Parent parent = new Parent();
        Parent motherAsParent = new Mother();
        motherAsParent.care();
        Mother mother = new Mother();
        mother.care();
        mother.cookMeal();

        City city = new City();
        City mumbaiAsCity = new Mumbai();
        mumbaiAsCity.grow();
        Mumbai mumbai = new Mumbai();
        mumbai.grow();
        mumbai.hostBollywood();

        Holiday holiday = new Holiday();
        Holiday newYearAsHoliday = new NewYear();
        newYearAsHoliday.relax();
        NewYear newYear = new NewYear();
        newYear.relax();
        newYear.countdown();

        Meeting meeting = new Meeting();
        Meeting officeMeetingAsMeeting = new OfficeMeeting();
        officeMeetingAsMeeting.schedule();
        OfficeMeeting officeMeeting = new OfficeMeeting();
        officeMeeting.schedule();
        officeMeeting.discussAgenda();

        Artist artist = new Artist();
        Artist painterAsArtist = new Painter();
        painterAsArtist.create();
        Painter painter = new Painter();
        painter.create();
        painter.mixColors();

        Craft craft = new Craft();
        Craft paperBoatAsCraft = new PaperBoat();
        paperBoatAsCraft.create();
        PaperBoat paperBoat = new PaperBoat();
        paperBoat.create();
        paperBoat.floatInWater();

        Place place = new Place();
        Place parkAsPlace = new Park();
        parkAsPlace.visit();
        Park park = new Park();
        park.visit();
        park.play();

        Bird bird = new Bird();
        Bird parrotAsBird = new Parrot();
        parrotAsBird.fly();
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.mimic();

        Chef chef = new Chef();
        Chef pastryChefAsChef = new PastryChef();
        pastryChefAsChef.cook();
        PastryChef pastryChef = new PastryChef();
        pastryChef.cook();
        pastryChef.bakeCake();

        Food food = new Food();
        Food pizzaAsFood = new Pizza();
        pizzaAsFood.prepare();
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();

        Painting painting = new Painting();
        Painting portraitAsPainting = new Portrait();
        portraitAsPainting.display();
        Portrait portrait = new Portrait();
        portrait.display();
        portrait.frame();

        Leader leader = new Leader();
        Leader presidentAsLeader = new President();
        presidentAsLeader.guide();
        President president = new President();
        president.guide();
        president.signBills();

        Weather weather = new Weather();
        Weather rainyAsWeather = new RainyWeather();
        rainyAsWeather.change();
        RainyWeather rainy = new RainyWeather();
        rainy.change();
        rainy.pourRain();

        Grain grain = new Grain();
        Grain riceAsGrain = new Rice();
        riceAsGrain.harvest();
        Rice rice = new Rice();
        rice.harvest();
        rice.cook();

        Plant plant = new Plant();
        Plant roseAsPlant = new RosePlant();
        roseAsPlant.grow();
        RosePlant rose = new RosePlant();
        rose.grow();
        rose.bloom();

        Athlete athlete = new Athlete();
        Athlete runnerAsAthlete = new RunnerA();
        runnerAsAthlete.train();
        RunnerA runner = new RunnerA();
        runner.train();
        runner.sprint();

        Accessory accessory = new Accessory();
        Accessory sandalAsAccessory = new Sandal();
        sandalAsAccessory.protectFeet();
        Sandal sandal = new Sandal();
        sandal.protectFeet();
        sandal.gripSurface();

        Cloth cloth = new Cloth();
        Cloth shirtAsCloth = new Shirt();
        shirtAsCloth.wear();
        Shirt shirt = new Shirt();
        shirt.wear();
        shirt.buttonUp();

        Device deviceP = new Device();
        Device smartDevice = new Smartphone();
        smartDevice.powerOn();
        Smartphone smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.installApp();

        Footwear footwear = new Footwear();
        Footwear sneakerWear = new Sneakers();
        sneakerWear.wear();
        Sneakers sneakers = new Sneakers();
        sneakers.wear();
        sneakers.tieLaces();

        Utensil utensil = new Utensil();
        utensil.holdFood();
        Utensil spoonAsUtensil = new Spoon();
        spoonAsUtensil.holdFood();
        Spoon spoon = new Spoon();
        spoon.holdFood();
        spoon.scoop();

        Book book = new Book();
        book.open();
        Book storyBookAsBook = new StoryBook();
        storyBookAsBook.open();
        StoryBook storyBook = new StoryBook();
        storyBook.open();
        storyBook.readStory();

        Flower flower = new Flower();
        flower.bloom();
        Flower sunflowerAsFlower = new Sunflower();
        sunflowerAsFlower.bloom();
        Sunflower sunflower = new Sunflower();
        sunflower.bloom();
        sunflower.faceSun();

        Toy toy = new Toy();
        toy.display();
        Toy teddyBearAsToy = new TeddyBear();
        teddyBearAsToy.display();
        TeddyBear teddyBear = new TeddyBear();
        teddyBear.display();
        teddyBear.hug();

        WildAnimal wildAnimal = new WildAnimal();
        wildAnimal.roamFreely();
        WildAnimal tigerAsWildAnimal = new Tiger();
        tigerAsWildAnimal.roamFreely();
        Tiger tiger = new Tiger();
        tiger.roamFreely();
        tiger.roar();

        Spice spice = new Spice();
        spice.addFlavor();
        Spice turmericAsSpice = new Turmeric();
        turmericAsSpice.addFlavor();
        Turmeric turmeric = new Turmeric();
        turmeric.addFlavor();
        turmeric.heal();

        Rhyme rhyme = new Rhyme();
        rhyme.recite();
        Rhyme twinkleTwinkleAsRhyme = new TwinkleTwinkle();
        twinkleTwinkleAsRhyme.recite();
        TwinkleTwinkle twinkleTwinkle = new TwinkleTwinkle();
        twinkleTwinkle.recite();
        twinkleTwinkle.teachStars();

        Area area = new Area();
        area.locate();
        Area villageAsArea = new Village();
        villageAsArea.locate();
        Village village = new Village();
        village.locate();
        village.growCrops();

        Appliance applianceP = new Appliance();
        applianceP.start();
        Appliance washingMachineAsAppliance = new WashingMachine();
        washingMachineAsAppliance.start();
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.start();
        washingMachine.washClothes();

        NaturalResource naturalResource = new NaturalResource();
        naturalResource.sustainLife();
        NaturalResource waterAsNaturalResource = new Water();
        waterAsNaturalResource.sustainLife();
        Water water = new Water();
        water.sustainLife();
        water.hydrate();

        Event event = new Event();
        event.organize();
        Event weddingAsEvent = new Wedding();
        weddingAsEvent.organize();
        Wedding wedding = new Wedding();
        wedding.organize();
        wedding.exchangeVows();

        Season season = new Season();
        Season winterStart = new Winter();
        winterStart.start();
        Winter winter = new Winter();
        winter.start();
        winter.snow();
    }

}
