package leopardcat.studio.daggerhiltstudy

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import leopardcat.studio.daggerhiltstudy.houses.AlertSystem
import leopardcat.studio.daggerhiltstudy.houses.AlertSystemModule
import leopardcat.studio.daggerhiltstudy.houses.Noise
import leopardcat.studio.daggerhiltstudy.houses.NoiseAlertSystem

@Module
@TestInstallIn(components = [SingletonComponent::class], replaces = [AlertSystemModule::class])
object FakeAlertSystemModule {

    @Provides
    @Noise
    fun provideAlertSystem(): AlertSystem {
        return NoiseAlertSystem()
    }
}