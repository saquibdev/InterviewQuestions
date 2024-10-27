class MicrosoftQuestion5 {
    public int[] findOriginalArray(final int[] changed) {
        if(changed.length % 2 == 1)
            return new int[] {};

        int n = 0;

        for(final int v : changed)
            n = Math.max(n, v);

        n++;

        final int[] occ = new int[n];

        for(final int v : changed)
            occ[v]++;

        final int[] res = new int[changed.length / 2];
        int k = 0;

        for(int i = 1; i < n; ++i) {
            if(occ[i] > 0) {
                if(i * 2 >= n || occ[i] > occ[i * 2])
                    return new int[] {};

                for(int j = 0; j < occ[i]; ++j)
                    res[k++] = i;

                occ[i * 2] -= occ[i];
            }
        }

        return res;
    }
}
