[Forwarded from Boss]
// 3 misol, jumanji   Class ham ochilgan, uni ham qoshing
        Scanner scanner = new Scanner(System.in);
        List<Ishtirokchi> ishtirokchilarList = new ArrayList();

        System.out.print("Ishtirokchilarning sonini kiriting - ");
        int ishtirokchilarSoni = scanner.nextInt();
        String ism;
        for (int i = 0; i < ishtirokchilarSoni; i++) {
            System.out.print("ishtirokchining ismini kiriting - ");
            ism = scanner.next();
            ishtirokchilarList.add(i, new Ishtirokchi(ism, 0));
        }

        boolean golib = false;
        while (!golib) {
            for (int i = 0; i < ishtirokchilarList.size(); i++) {
                Random random = new Random();
                ishtirokchilarList.get(i).sonQiymati += random.nextInt(1, 3);
            }

            for (int i = 0; i < ishtirokchilarList.size(); i++) {
                if (ishtirokchilarList.get(i).sonQiymati >= 25) {
                    System.out.println(ishtirokchilarList.get(i).ism + " ishtirokchi g'olib bo'ldi");
                    golib = true;
                    break;
                }
            }
        }

        for (int i = 0; i < ishtirokchilarList.size(); i++) {
            System.out.println(ishtirokchilarList.get(i).ism +" "+ ishtirokchilarList.get(i).sonQiymati);
        }

      