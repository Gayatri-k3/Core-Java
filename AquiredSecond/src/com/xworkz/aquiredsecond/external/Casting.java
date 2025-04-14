package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.*;

public class Casting {
    public void cSoftware(Software software) {
        if (software != null) {
            software.run();
            if (software instanceof Antivirus) {
                Antivirus antivirus = (Antivirus) software;
                antivirus.scan();
            } else {
                System.err.println("software is not antivirus");
            }
        } else {
            System.err.println("software is null..");
        }
    }

    public void cCaregiver(Caregiver caregiver) {
        if (caregiver != null) {
            caregiver.takeCare();
            if (caregiver instanceof Babysitter) {
                Babysitter babysitter = (Babysitter) caregiver;
                babysitter.changeDiaper();
            } else {
                System.err.println("caregiver is not babysitter");
            }
        } else {
            System.err.println("caregiver is null..");
        }
    }

    public void cFruit(Fruit fruit) {
        if (fruit != null) {
            fruit.ripen();
            if (fruit instanceof Banana) {
                Banana banana = (Banana) fruit;
                banana.peel();
            } else {
                System.err.println("fruit is not banana");
            }
        } else {
            System.err.println("fruit is null..");
        }
    }

    public void cVacation(Vacation vacation) {
        if (vacation != null) {
            vacation.enjoyTime();
            if (vacation instanceof BeachHoliday) {
                BeachHoliday beachHoliday = (BeachHoliday) vacation;
                beachHoliday.swim();
            } else {
                System.err.println("vacation is not beachHoliday");
            }
        } else {
            System.err.println("vacation is null..");
        }
    }

    public void cFriend(Friend friend) {
        if (friend != null) {
            friend.hangOut();
            if (friend instanceof BestFriend) {
                BestFriend bestFriend = (BestFriend) friend;
                bestFriend.shareSecrets();
            } else {
                System.err.println("friend is not bestFriend");
            }
        } else {
            System.err.println("friend is null..");
        }
    }

    public void cVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.move();
            if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                bicycle.ringBell();
            } else {
                System.err.println("vehicle is not bicycle");
            }
        } else {
            System.err.println("vehicle is null..");
        }
    }

    public void cCelebration(Celebration celebration) {
        if (celebration != null) {
            celebration.enjoy();
            if (celebration instanceof BirthdayParty) {
                BirthdayParty birthdayParty = (BirthdayParty) celebration;
                birthdayParty.cutCake();
            } else {
                System.err.println("celebration is not birthdayParty");
            }
        } else {
            System.err.println("celebration is null..");
        }
    }

    public void cSibling(Sibling sibling) {
        if (sibling != null) {
            sibling.growUpTogether();
            if (sibling instanceof Brother) {
                Brother brother = (Brother) sibling;
                brother.protect();
            } else {
                System.err.println("sibling is not brother");
            }
        } else {
            System.err.println("sibling is null..");
        }
    }

    public void cLeader(Leader leader) {
        if (leader != null) {
            leader.guide();
            if (leader instanceof President) {
                President president = (President) leader;
                president.signBills();
            } else {
                System.err.println("leader is not president");
            }
        } else {
            System.err.println("leader is null..");
        }
    }

    public void cTeacher(Teacher teacher) {
        if (teacher != null) {
            teacher.teach();
            if (teacher instanceof MathTeacher) {
                MathTeacher mathTeacher = (MathTeacher) teacher;
                mathTeacher.solveEquation();
            } else {
                System.err.println("teacher is not mathTeacher");
            }
        } else {
            System.err.println("teacher is null..");
        }
    }

    public void cStudent(Student student) {
        if (student != null) {
            student.study();
            if (student instanceof CollegeStudent) {
                CollegeStudent collegeStudent = (CollegeStudent) student;
                collegeStudent.attendLecture();
            } else {
                System.err.println("student is not collegeStudent");
            }
        } else {
            System.err.println("student is null..");
        }
    }

    public void cDriver(Driver driver) {
        if (driver != null) {
            driver.drive();
            if (driver instanceof BusDriver) {
                BusDriver busDriver = (BusDriver) driver;
                busDriver.stopAtStation();
            } else {
                System.err.println("driver is not busDriver");
            }
        } else {
            System.err.println("driver is null..");
        }
    }

    public void cParent(Parent parent) {
        if (parent != null) {
            parent.care();
            if (parent instanceof Mother) {
                Mother mother = (Mother) parent;
                mother.cookMeal();
            } else {
                System.err.println("parent is not mother");
            }
        } else {
            System.err.println("parent is null..");
        }
    }

    public void cChef(Chef chef) {
        if (chef != null) {
            chef.cook();
            if (chef instanceof PastryChef) {
                PastryChef pastryChef = (PastryChef) chef;
                pastryChef.bakeCake();
            } else {
                System.err.println("chef is not pastryChef");
            }
        } else {
            System.err.println("chef is null..");
        }
    }

    public void cAthlete(Athlete athlete) {
        if (athlete != null) {
            athlete.train();
            if (athlete instanceof RunnerA) {
                RunnerA runner = (RunnerA) athlete;
                runner.sprint();
            } else {
                System.err.println("athlete is not runner");
            }
        } else {
            System.err.println("athlete is null..");
        }
    }

    public void cArtist(Artist artist) {
        if (artist != null) {
            artist.create();
            if (artist instanceof Painter) {
                Painter painter = (Painter) artist;
                painter.mixColors();
            } else {
                System.err.println("artist is not painter");
            }
        } else {
            System.err.println("artist is null..");
        }
    }

    public void cContainer(Container container) {
        if (container != null) {
            container.fill();
            if (container instanceof Bottle) {
                Bottle bottle = (Bottle) container;
                bottle.pour();
            } else {
                System.err.println("container is not bottle");
            }
        } else {
            System.err.println("container is null..");
        }
    }

    public void cTransport(Transport transport) {
        if (transport != null) {
            transport.operate();
            if (transport instanceof Bus) {
                Bus bus = (Bus) transport;
                bus.pickPassengers();
            } else {
                System.err.println("transport is not bus");
            }
        } else {
            System.err.println("transport is null..");
        }
    }

    public void cInsect(Insect insect) {
        if (insect != null) {
            insect.crawl();
            if (insect instanceof Butterfly) {
                Butterfly butterfly = (Butterfly) insect;
                butterfly.fly();
            } else {
                System.err.println("insect is not butterfly");
            }
        } else {
            System.err.println("insect is null..");
        }
    }

    public void cVegetable(Vegetable vegetable) {
        if (vegetable != null) {
            vegetable.grow();
            if (vegetable instanceof Carrot) {
                Carrot carrot = (Carrot) vegetable;
                carrot.improveVision();
            } else {
                System.err.println("vegetable is not carrot");
            }
        } else {
            System.err.println("vegetable is null..");
        }
    }

    public void cFeed(Pet pet) {
        if (pet != null) {
            pet.feed();
            if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                cat.purr();
            } else {
                System.err.println("Pet is not a Cat");
            }
        } else {
            System.err.println("Pet is null...");
        }
    }

    public void cSupport(Furniture furniture) {
        if (furniture != null) {
            furniture.support();
            if (furniture instanceof Chair) {
                Chair chair = (Chair) furniture;
                chair.fold();
            } else {
                System.err.println("Furniture is not a Chair");
            }
        } else {
            System.err.println("Furniture is null...");
        }
    }

    public void cStore(DairyProduct dairyProduct) {
        if (dairyProduct != null) {
            dairyProduct.store();
            if (dairyProduct instanceof Cheese) {
                Cheese cheese = (Cheese) dairyProduct;
                cheese.melt();
            } else {
                System.err.println("Dairy product is not cheese");
            }
        } else {
            System.err.println("Dairy product is null...");
        }
    }

    public void cSleep(Person person) {
        if (person != null) {
            person.sleep();
            if (person instanceof Child) {
                Child child = (Child) person;
                child.talk();
            } else {
                System.err.println("Person is not a Child");
            }
        } else {
            System.err.println("Person is null...");
        }
    }

    public void cTreat(Hospital hospital) {
        if (hospital != null) {
            hospital.treat();
            if (hospital instanceof ChildrenHospital) {
                ChildrenHospital childrenHospital = (ChildrenHospital) hospital;
                childrenHospital.careForKids();
            } else {
                System.err.println("Hospital is not a ChildrenHospital");
            }
        } else {
            System.err.println("Hospital is null...");
        }
    }

    public void cPack(Snack snack) {
        if (snack != null) {
            snack.pack();
            if (snack instanceof Chips) {
                Chips chips = (Chips) snack;
                chips.crunch();
            } else {
                System.err.println("Snack is not Chips");
            }
        } else {
            System.err.println("Snack is null...");
        }
    }

    public void cStudy(Student student) {
        if (student != null) {
            student.study();
            if (student instanceof CollegeStudent) {
                CollegeStudent collegeStudent = (CollegeStudent) student;
                collegeStudent.attendLecture();
            } else {
                System.err.println("Student is not a CollegeStudent");
            }
        } else {
            System.err.println("Student is null...");
        }
    }

    public void cVisit(Relative relative) {
        if (relative != null) {
            relative.visit();
            if (relative instanceof Cousin) {
                Cousin cousin = (Cousin) relative;
                cousin.playGames();
            } else {
                System.err.println("Relative is not a Cousin");
            }
        } else {
            System.err.println("Relative is null...");
        }
    }

    public void cPlay(Game game) {
        if (game != null) {
            game.play();
            if (game instanceof Cricket) {
                Cricket cricket = (Cricket) game;
                cricket.scoreRun();
            } else {
                System.err.println("Game is not Cricket");
            }
        } else {
            System.err.println("Game is null...");
        }
    }

    public void cPlay(Child1 child1) {
        if (child1 != null) {
            child1.play();
            if (child1 instanceof Daughter) {
                Daughter daughter = (Daughter) child1;
                daughter.helpMother();
            } else {
                System.err.println("Child1 is not a Daughter");
            }
        } else {
            System.err.println("Child1 is null...");
        }
    }

    public void cCelebrate(Festival festival) {
        if (festival != null) {
            festival.celebrate();
            if (festival instanceof Diwali) {
                Diwali diwali = (Diwali) festival;
                diwali.burstCrackers();
            } else {
                System.err.println("Festival is not Diwali");
            }
        } else {
            System.err.println("Festival is null...");
        }
    }

    public void cMakeSound(Animal animal) {
        if (animal != null) {
            animal.makeSound();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();
            } else {
                System.err.println("Animal is not a Dog");
            }
        } else {
            System.err.println("Animal is null...");
        }
    }

    public void cFloatInWater(AquaticAnimal aquaticAnimal) {
        if (aquaticAnimal != null) {
            aquaticAnimal.floatInWater();
            if (aquaticAnimal instanceof Dolphin) {
                Dolphin dolphin = (Dolphin) aquaticAnimal;
                dolphin.communicate();
            } else {
                System.err.println("Aquatic animal is not a Dolphin");
            }
        } else {
            System.err.println("Aquatic animal is null...");
        }
    }

    public void cPerform(Activity activity) {
        if (activity != null) {
            activity.perform();
            if (activity instanceof Drawing) {
                Drawing drawing = (Drawing) activity;
                drawing.usePencil();
            } else {
                System.err.println("Activity is not Drawing");
            }
        } else {
            System.err.println("Activity is null...");
        }
    }

    public void cSoar(FlyingAnimal flyingAnimal) {
        if (flyingAnimal != null) {
            flyingAnimal.soar();
            if (flyingAnimal instanceof Eagle) {
                Eagle eagle = (Eagle) flyingAnimal;
                eagle.hunt();
            } else {
                System.err.println("Flying animal is not an Eagle");
            }
        } else {
            System.err.println("Flying animal is null...");
        }
    }

    public void cNurseYoung(Mammal mammal) {
        if (mammal != null) {
            mammal.nurseYoung();
            if (mammal instanceof Elephant) {
                Elephant elephant = (Elephant) mammal;
                elephant.sprayWater();
            } else {
                System.err.println("Mammal is not an Elephant");
            }
        } else {
            System.err.println("Mammal is null...");
        }
    }

    public void cFunction(VehiclePart vehiclePart) {
        if (vehiclePart != null) {
            vehiclePart.function();
            if (vehiclePart instanceof Engine) {
                Engine engine = (Engine) vehiclePart;
                engine.ignite();
            } else {
                System.err.println("Vehicle part is not an Engine");
            }
        } else {
            System.err.println("Vehicle part is null...");
        }
    }

    public void cConsumeElectricity(ElectronicItem electronicItem) {
        if (electronicItem != null) {
            electronicItem.consumeElectricity();
            if (electronicItem instanceof Fan) {
                Fan fan = (Fan) electronicItem;
                fan.rotate();
            } else {
                System.err.println("Electronic item is not a Fan");
            }
        } else {
            System.err.println("Electronic item is null...");
        }
    }

    public void cWork(Worker worker) {
        if (worker != null) {
            worker.work();
            if (worker instanceof Farmer) {
                Farmer farmer = (Farmer) worker;
                farmer.yield();
            } else {
                System.err.println("Worker is not a Farmer");
            }
        } else {
            System.err.println("Worker is null...");
        }
    }

    public void cPlay(Sport sport) {
        if (sport != null) {
            sport.play();
            if (sport instanceof Football) {
                Football football = (Football) sport;
                football.kickBall();
            } else {
                System.err.println("Sport is not Football");
            }
        } else {
            System.err.println("Sport is null...");
        }
    }

    public void cFlow(River river) {
        if (river != null) {
            river.flow();
            if (river instanceof Ganga) {
                Ganga ganga = (Ganga) river; // Casting
                ganga.purify();
            } else {
                System.err.println("River is not Ganga");
            }
        } else {
            System.err.println("River is null...");
        }
    }
    public void cFish(Fish fish)
    {
        if(fish != null) {
            fish.swim(); // Calling superclass method
            if(fish instanceof Goldfish) {
                Goldfish goldfish = (Goldfish) fish; // casting
                goldfish.blowBubbles(); // Subclass specific method
            }
            else{
                System.err.println("Fish is not a Goldfish");
            }
        }
        else{
            System.err.println("Fish is null..");
        }
    }
    public void cCeremony(Ceremony ceremony)
    {
        if(ceremony != null) {
            ceremony.commence(); // Calling superclass method
            if(ceremony instanceof GraduationCeremony) {
                GraduationCeremony graduationCeremony = (GraduationCeremony) ceremony; // casting
                graduationCeremony.giveDegrees(); // Subclass specific method
            }
            else{
                System.err.println("Ceremony is not a GraduationCeremony");
            }
        }
        else{
            System.err.println("Ceremony is null..");
        }
    }
    public void cGuardian(Guardian guardian)
    {
        if(guardian != null) {
            guardian.protect(); // Calling superclass method
            if(guardian instanceof Grandparent) {
                Grandparent grandparent = (Grandparent) guardian; // casting
                grandparent.tellStories(); // Subclass specific method
            }
            else{
                System.err.println("Guardian is not a Grandparent");
            }
        }
        else{
            System.err.println("Guardian is null..");
        }
    }
    public void cRock(Rock rock)
    {
        if(rock != null) {
            rock.erodeSlowly(); // Calling superclass method
            if(rock instanceof Granite) {
                Granite granite = (Granite) rock; // casting
                granite.polish(); // Subclass specific method
            }
            else{
                System.err.println("Rock is not a Granite");
            }
        }
        else{
            System.err.println("Rock is null..");
        }
    }

    public void cStore(Store store)
    {
        if(store != null) {
            store.sellItems(); // Calling superclass method
            if(store instanceof GroceryStore) {
                GroceryStore groceryStore = (GroceryStore) store; // casting
                groceryStore.stockFood(); // Subclass specific method
            }
            else{
                System.err.println("Store is not a GroceryStore");
            }
        }
        else{
            System.err.println("Store is null..");
        }
    }
    public void cInstrument(Instrument instrument)
    {
        if(instrument != null) {
            instrument.play();
            if(instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.strum();
            }
            else{
                System.err.println("Instrument is not a Guitar");
            }
        }
        else{
            System.err.println("Instrument is null..");
        }
    }
    public void cTool(Tool tool)
    {
        if(tool != null) {
            tool.use();
            if(tool instanceof Hammer) {
                Hammer hammer = (Hammer) tool;
                hammer.hitNail();
            }
            else{
                System.err.println("Tool is not a Hammer");
            }
        }
        else{
            System.err.println("Tool is null..");
        }
    }
    public void cEmotion(Emotion emotion)
    {
        if(emotion != null) {
            emotion.feel();
            if(emotion instanceof Happiness) {
                Happiness happiness = (Happiness) emotion;
                happiness.smile();
            }
            else{
                System.err.println("Emotion is not Happiness");
            }
        }
        else{
            System.err.println("Emotion is null..");
        }
    }
    public void cSchool(School school)
    {
        if(school != null) {
            school.teach();
            if(school instanceof HighSchool) {
                HighSchool highSchool = (HighSchool) school;
                highSchool.conductExams();
            }
            else{
                System.err.println("School is not HighSchool");
            }
        }
        else{
            System.err.println("School is null..");
        }
    }
    public void cMountain(Mountain mountain)
    {
        if(mountain != null) {
            mountain.standTall();
            if(mountain instanceof Himalaya) {
                Himalaya himalaya = (Himalaya) mountain;
                himalaya.attractClimbers();
            }
            else{
                System.err.println("Mountain is not Himalaya");
            }
        }
        else{
            System.err.println("Mountain is null..");
        }
    }
    public void cTemple(Temple temple)
    {
        if(temple != null) {
            temple.worship();
            if(temple instanceof HinduTemple) {
                HinduTemple hinduTemple = (HinduTemple) temple;
                hinduTemple.ringBell();
            }
            else{
                System.err.println("Temple is not HinduTemple");
            }
        }
        else{
            System.err.println("Temple is null..");
        }
    }
    public void cBuilding(Building building)
    {
        if(building != null) {
            building.openDoor();
            if(building instanceof House) {
                House house = (House) building;
                house.switchOnLights();
            }
            else{
                System.err.println("Building is not House");
            }
        }
        else{
            System.err.println("Building is null..");
        }
    }
    public void cPartner(Partner partner)
    {
        if(partner != null) {
            partner.support();
            if(partner instanceof Husband) {
                Husband husband = (Husband) partner;
                husband.provide();
            }
            else{
                System.err.println("Partner is not Husband");
            }
        }
        else{
            System.err.println("Partner is null..");
        }
    }
    public void cDessert(Dessert dessert)
    {
        if(dessert != null) {
            dessert.serve();
            if(dessert instanceof IceCream) {
                IceCream iceCream = (IceCream) dessert;
                iceCream.freeze();
            }
            else{
                System.err.println("Dessert is not IceCream");
            }
        }
        else{
            System.err.println("Dessert is null..");
        }
    }
    public void cCountry(Country country)
    {
        if(country != null) {
            country.unite();
            if(country instanceof India) {
                India india = (India) country;
                india.celebrateDiversity();
            }
            else{
                System.err.println("Country is not India");
            }
        }
        else{
            System.err.println("Country is null..");
        }
    }
    public void cPuzzle(Puzzle puzzle)
    {
        if(puzzle != null) {
            puzzle.solve();
            if(puzzle instanceof JigsawPuzzle) {
                JigsawPuzzle jigsawPuzzle = (JigsawPuzzle) puzzle;
                jigsawPuzzle.fitPieces();
            }
            else{
                System.err.println("Puzzle is not JigsawPuzzle");
            }
        }
        else{
            System.err.println("Puzzle is null..");
        }
    }
    public void cDrink(Drink drink)
    {
        if(drink != null) {
            drink.serve();
            if(drink instanceof Juice) {
                Juice juice = (Juice) drink;
                juice.mixFlavors();
            }
            else{
                System.err.println("Drink is not Juice");
            }
        }
        else{
            System.err.println("Drink is null..");
        }
    }
    public void cRoom(Room room)
    {
        if(room != null) {
            room.enter();
            if(room instanceof Kitchen) {
                Kitchen kitchen = (Kitchen) room;
                kitchen.cookFood();
            }
            else{
                System.err.println("Room is not Kitchen");
            }
        }
        else{
            System.err.println("Room is null..");
        }
    }
    public void cSweet(Sweet sweet)
    {
        if(sweet != null) {
            sweet.make();
            if(sweet instanceof Ladoo) {
                Ladoo ladoo = (Ladoo) sweet;
                ladoo.offerInTemple();
            }
            else{
                System.err.println("Sweet is not Ladoo");
            }
        }
        else{
            System.err.println("Sweet is null..");
        }
    }
    public void cReptile(Reptile reptile)
    {
        if(reptile != null) {
            reptile.shedSkin();
            if(reptile instanceof Lizard) {
                Lizard lizard = (Lizard) reptile;
                lizard.climbWall();
            }
            else{
                System.err.println("Reptile is not Lizard");
            }
        }
        else{
            System.err.println("Reptile is null..");
        }
    }
    public void cMeal(Meal meal)
    {
        if(meal != null) {
            meal.serve();
            if(meal instanceof Lunch) {
                Lunch lunch = (Lunch) meal;
                lunch.energize();
            }
            else{
                System.err.println("Meal is not Lunch");
            }
        }
        else{
            System.err.println("Meal is null..");
        }
    }
    public void cTree(Tree tree)
    {
        if(tree != null) {
            tree.grow();
            if(tree instanceof MangoTree) {
                MangoTree mangoTree = (MangoTree) tree;
                mangoTree.produceMangoes();
            }
            else{
                System.err.println("Tree is not MangoTree");
            }
        }
        else{
            System.err.println("Tree is null..");
        }
    }
    public void cKitchenAppliance(KitchenAppliance kitchenAppliance)
    {
        if(kitchenAppliance != null) {
            kitchenAppliance.plugIn();
            if(kitchenAppliance instanceof Mixer) {
                Mixer mixer = (Mixer) kitchenAppliance;
                mixer.blend();
            }
            else{
                System.err.println("KitchenAppliance is not Mixer");
            }
        }
        else{
            System.err.println("KitchenAppliance is null..");
        }
    }
    public void cDay(Day day)
    {
        if(day != null) {
            day.start();
            if(day instanceof Monday) {
                Monday monday = (Monday) day;
                monday.feelLazy();
            }
            else{
                System.err.println("Day is not Monday");
            }
        }
        else{
            System.err.println("Day is null..");
        }
    }
    public void cTimePeriod(TimePeriod timePeriod)
    {
        if(timePeriod != null) {
            timePeriod.begin();
            if(timePeriod instanceof Morning) {
                Morning morning = (Morning) timePeriod;
                morning.shineSun();
            }
            else{
                System.err.println("TimePeriod is not Morning");
            }
        }
        else{
            System.err.println("TimePeriod is null..");
        }
    }
    public void cCity(City city)
    {
        if(city != null) {
            city.grow();
            if(city instanceof Mumbai) {
                Mumbai mumbai = (Mumbai) city;
                mumbai.hostBollywood();
            }
            else{
                System.err.println("City is not Mumbai");
            }
        }
        else{
            System.err.println("City is null..");
        }
    }
    public void cHoliday(Holiday holiday)
    {
        if(holiday != null) {
            holiday.relax();
            if(holiday instanceof NewYear) {
                NewYear newYear = (NewYear) holiday;
                newYear.countdown();
            }
            else{
                System.err.println("Holiday is not NewYear");
            }
        }
        else{
            System.err.println("Holiday is null..");
        }
    }
    public void cNeighbor(Neighbor neighbor)
    {
        if(neighbor != null) {
            neighbor.greet();
            if(neighbor instanceof NextDoorNeighbor) {
                NextDoorNeighbor next = (NextDoorNeighbor) neighbor;
                next.borrowSugar();
            }
            else{
                System.err.println("Neighbor is not NextDoorNeighbor");
            }
        }
        else{
            System.err.println("Neighbor is null..");
        }
    }
    public void cSong(Song song)
    {
        if(song != null) {
            song.sing();
            if(song instanceof NurserySong) {
                NurserySong nursery = (NurserySong) song;
                nursery.teachAlphabet();
            }
            else{
                System.err.println("Song is not NurserySong");
            }
        }
        else{
            System.err.println("Song is null..");
        }
    }
    public void cMeeting(Meeting meeting)
    {
        if(meeting != null) {
            meeting.schedule();
            if(meeting instanceof OfficeMeeting) {
                OfficeMeeting office = (OfficeMeeting) meeting;
                office.discussAgenda();
            }
            else{
                System.err.println("Meeting is not OfficeMeeting");
            }
        }
        else{
            System.err.println("Meeting is null..");
        }
    }
    public void cCraft(Craft craft)
    {
        if(craft != null) {
            craft.create();
            if(craft instanceof PaperBoat) {
                PaperBoat paperBoat = (PaperBoat) craft;
                paperBoat.floatInWater();
            }
            else{
                System.err.println("Craft is not PaperBoat");
            }
        }
        else{
            System.err.println("Craft is null..");
        }
    }
    public void cPlace(Place place)
    {
        if(place != null) {
            place.visit();
            if(place instanceof Park) {
                Park park = (Park) place;
                park.play();
            }
            else {
                System.err.println("Place is not Park");
            }
        }
        else {
            System.err.println("Place is null..");
        }
    }
    public void cBird(Bird bird)
    {
        if(bird != null) {
            bird.fly();
            if(bird instanceof Parrot) {
                Parrot parrot = (Parrot) bird;
                parrot.mimic();
            }
            else {
                System.err.println("Bird is not Parrot");
            }
        }
        else {
            System.err.println("Bird is null..");
        }
    }
    public void cFood(Food food)
    {
        if(food != null) {
            food.prepare();
            if(food instanceof Pizza) {
                Pizza pizza = (Pizza) food;
                pizza.bake();
            }
            else {
                System.err.println("Food is not Pizza");
            }
        }
        else {
            System.err.println("Food is null..");
        }
    }
    public void cComputerComponent(ComputerComponent component)
    {
        if(component != null) {
            component.work();
            if(component instanceof Processor) {
                Processor processor = (Processor) component;
                processor.compute();
            }
            else {
                System.err.println("Component is not Processor");
            }
        }
        else {
            System.err.println("Component is null..");
        }
    }
    public void cWeather(Weather weather)
    {
        if(weather != null) {
            weather.change();
            if(weather instanceof RainyWeather) {
                RainyWeather rainyWeather = (RainyWeather) weather;
                rainyWeather.pourRain();
            }
            else {
                System.err.println("Weather is not RainyWeather");
            }
        }
        else {
            System.err.println("Weather is null..");
        }
    }
    public void cGrain(Grain grain)
    {
        if(grain != null) {
            grain.harvest();
            if(grain instanceof Rice) {
                Rice rice = (Rice) grain;
                rice.cook();
            }
            else {
                System.err.println("Grain is not Rice");
            }
        }
        else {
            System.err.println("Grain is null..");
        }
    }
    public void cPlant(Plant plant)
    {
        if(plant != null) {
            plant.grow();
            if(plant instanceof RosePlant) {
                RosePlant rosePlant = (RosePlant) plant;
                rosePlant.bloom();
            }
            else {
                System.err.println("Plant is not a RosePlant");
            }
        }
        else {
            System.err.println("Plant is null..");
        }
    }
    public void cTrain(Athlete athlete)
    {
        if(athlete != null) {
            athlete.train();
            if(athlete instanceof RunnerA) {
                RunnerA runnerA = (RunnerA) athlete;
                runnerA.sprint();
            }
            else {
                System.err.println("Athlete is not a RunnerA");
            }
        }
        else {
            System.err.println("Athlete is null..");
        }
    }
    public void wearFootwear(Accessory accessory) {
        if(accessory != null) {
            accessory.protectFeet();
            if(accessory instanceof Sandal) {
                Sandal sandal = (Sandal) accessory;
                sandal.gripSurface();
            }
            else {
                System.err.println("Accessory is not a Sandal");
            }
        }
        else {
            System.err.println("Accessory is null..");
        }
    }
    public void wearCloth(Cloth cloth) {
        if(cloth != null) {
            cloth.wear();
            if(cloth instanceof Shirt) {
                Shirt shirt = (Shirt) cloth;
                shirt.buttonUp();
            }
            else {
                System.err.println("Cloth is not a Shirt");
            }
        }
        else {
            System.err.println("Cloth is null..");
        }
    }
    public void useDevice(Device device) {
        if(device != null) {
            device.powerOn();
            if(device instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) device;
                smartphone.installApp();
            }
            else {
                System.err.println("Device is not a Smartphone");
            }
        }
        else {
            System.err.println("Device is null..");
        }
    }
    public void useFootwear(Footwear footwear) {
        if(footwear != null) {
            footwear.wear();
            if(footwear instanceof Sneakers) {
                Sneakers sneakers = (Sneakers) footwear;
                sneakers.tieLaces();
            }
            else {
                System.err.println("Footwear is not Sneakers");
            }
        }
        else {
            System.err.println("Footwear is null..");
        }
    }
    public void useUtensil(Utensil utensil) {
        if(utensil != null) {
            utensil.holdFood();
            if(utensil instanceof Spoon) {
                Spoon spoon = (Spoon) utensil;
                spoon.scoop();
            }
            else {
                System.err.println("Utensil is not a Spoon");
            }
        }
        else {
            System.err.println("Utensil is null..");
        }
    }
    public void handleBook(Book book) {
        if (book != null) {
            book.open();  // Calling the method from the superclass
            if (book instanceof StoryBook) {
                StoryBook storyBook = (StoryBook) book;
                storyBook.readStory();  // Calling subclass-specific method
            } else {
                System.err.println("This is not a StoryBook");
            }
        } else {
            System.err.println("Book is null..");
        }
    }
    public void handleFlower(Flower flower) {
        if (flower != null) {
            flower.bloom();  // Calls the method from Flower class
            if (flower instanceof Sunflower) {
                Sunflower sunflower = (Sunflower) flower;
                sunflower.faceSun();  // Calls the Sunflower-specific method
            } else {
                System.err.println("This is not a Sunflower");
            }
        } else {
            System.err.println("Flower is null..");
        }
    }
    public void handleCostume(Costume costume) {
        if (costume != null) {
            costume.wear();
            if (costume instanceof SuperheroCostume) {
                SuperheroCostume superheroCostume = (SuperheroCostume) costume;
                superheroCostume.saveWorld();
            } else {
                System.err.println("This is not a SuperheroCostume");
            }
        } else {
            System.err.println("Costume is null..");
        }
    }
    public void cDrink(Beverage beverage) {
        if (beverage != null) {
            beverage.drink();
            if (beverage instanceof Tea) {
                Tea tea = (Tea) beverage;
                tea.addMilk();
            } else {
                System.err.println("Beverage is not Tea");
            }
        } else {
            System.err.println("Beverage is null...");
        }
    }
    public void cDisplay(Toy toy) {
        if (toy != null) {
            toy.display();
            if (toy instanceof TeddyBear) {
                TeddyBear teddyBear = (TeddyBear) toy;
                teddyBear.hug();
            } else {
                System.err.println("Toy is not TeddyBear");
            }
        } else {
            System.err.println("Toy is null...");
        }
    }
    public void cRoamFreely(WildAnimal wildAnimal) {
        if (wildAnimal != null) {
            wildAnimal.roamFreely();
            if (wildAnimal instanceof Tiger) {
                Tiger tiger = (Tiger) wildAnimal;
                tiger.roar();
            } else {
                System.err.println("WildAnimal is not Tiger");
            }
        } else {
            System.err.println("WildAnimal is null...");
        }
    }
    public void cEntertain(Cartoon cartoon) {
        if (cartoon != null) {
            cartoon.entertain();
            if (cartoon instanceof TomAndJerry) {
                TomAndJerry tomAndJerry = (TomAndJerry) cartoon;
                tomAndJerry.chase();
            } else {
                System.err.println("Cartoon is not TomAndJerry");
            }
        } else {
            System.err.println("Cartoon is null...");
        }
    }
    public void cAddFlavor(Spice spice) {
        if (spice != null) {
            spice.addFlavor();
            if (spice instanceof Turmeric) {
                Turmeric turmeric = (Turmeric) spice;
                turmeric.heal();
            } else {
                System.err.println("Spice is not Turmeric");
            }
        } else {
            System.err.println("Spice is null...");
        }
    }
    public void cRecite(Rhyme rhyme) {
        if (rhyme != null) {
            rhyme.recite();
            if (rhyme instanceof TwinkleTwinkle) {
                TwinkleTwinkle twinkleTwinkle = (TwinkleTwinkle) rhyme;
                twinkleTwinkle.teachStars();
            } else {
                System.err.println("Rhyme is not TwinkleTwinkle");
            }
        } else {
            System.err.println("Rhyme is null...");
        }
    }
    public void cLocate(Area area) {
        if (area != null) {
            area.locate();
            if (area instanceof Village) {
                Village village = (Village) area;
                village.growCrops();
            } else {
                System.err.println("Area is not Village");
            }
        } else {
            System.err.println("Area is null...");
        }
    }
    public void cStart(Appliance appliance) {
        if (appliance != null) {
            appliance.start();
            if (appliance instanceof WashingMachine) {
                WashingMachine washingMachine = (WashingMachine) appliance;
                washingMachine.washClothes();
            } else {
                System.err.println("Appliance is not WashingMachine");
            }
        } else {
            System.err.println("Appliance is null...");
        }
    }
    public void cSustainLife(NaturalResource resource) {
        if (resource != null) {
            resource.sustainLife();
            if (resource instanceof Water) {
                Water water = (Water) resource;
                water.hydrate();
            } else {
                System.err.println("Resource is not Water");
            }
        } else {
            System.err.println("Resource is null...");
        }
    }
    public void cOrganize(Event event) {
        if (event != null) {
            event.organize();
            if (event instanceof Wedding) {
                Wedding wedding = (Wedding) event;
                wedding.exchangeVows();
            } else {
                System.err.println("Event is not Wedding");
            }
        } else {
            System.err.println("Event is null...");
        }
    }
    public void cLove(Spouse spouse) {
        if (spouse != null) {
            spouse.love();
            if (spouse instanceof Wife) {
                Wife wife = (Wife) spouse;
                wife.cookMeal();
            } else {
                System.err.println("Spouse is not Wife");
            }
        } else {
            System.err.println("Spouse is null...");
        }
    }
    public void cStart(Season season) {
        if (season != null) {
            season.start();
            if (season instanceof Winter) {
                Winter winter = (Winter) season;
                winter.snow();
            } else {
                System.err.println("Season is not Winter");
            }
        } else {
            System.err.println("Season is null...");
        }
    }
}
